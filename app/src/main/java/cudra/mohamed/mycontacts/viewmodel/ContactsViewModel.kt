package cudra.mohamed.mycontacts.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cudra.mohamed.mycontacts.model.Contact
import cudra.mohamed.mycontacts.repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel: ViewModel() {
    val contactsRepository=ContactsRepository()
    lateinit var contactsLiveData: LiveData<Contact>    //observe livedata from ui
    lateinit var contactLiveData: LiveData<List<Contact>>

    fun saveContact(contact:Contact){
        viewModelScope.launch {
            contactsRepository.saveContact(contact)
        }
    }
    fun fetchContactById(contactId:Int) {
        contactsLiveData=contactsRepository.getContactsById(contactId)  //only observed from IO thread in the mainthread
    }
    fun getAllContacts(){
        contactLiveData=contactsRepository.getAllContacts()
    }
}
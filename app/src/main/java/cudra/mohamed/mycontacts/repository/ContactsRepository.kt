package cudra.mohamed.mycontacts.repository

import androidx.lifecycle.LiveData
import cudra.mohamed.mycontacts.MyContacts
import cudra.mohamed.mycontacts.database.ContactsDB
import cudra.mohamed.mycontacts.model.Contact
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database=ContactsDB.getDatabase(MyContacts.appContext)

    suspend fun saveContact(contact:Contact){
        withContext(Dispatchers.IO){
            database.contactDao().insertContact(contact)
        }
    }

    fun getContactsById(contactId:Int): LiveData<Contact> {
        return database.contactDao().getContactsById(contactId)
    }
    fun getAllContacts():LiveData<List<Contact>>{
        return database.contactDao().getAllContacts()
    }
}
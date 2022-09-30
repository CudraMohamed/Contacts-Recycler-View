package cudra.mohamed.mycontacts.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import cudra.mohamed.mycontacts.database.ContactsDB
import cudra.mohamed.mycontacts.databinding.ActivityAddContactBinding
import cudra.mohamed.mycontacts.model.Contact
import cudra.mohamed.mycontacts.viewmodel.ContactsViewModel


class AddContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding
    val contactsViewModel:ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityAddContactBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        val contacts: List<Contact> = ContactsDB.getAllContacts()

    }

    override fun onResume() {
        super.onResume()
        binding.btnSaveContacts.setOnClickListener {
            validateAddContact()
        }
//        if (listcounter < contacts.size()) {
//            val cn: Contact = contacts.get(listcounter)
//            name.setText("")
//            name.append("Id: " + cn.getID())
//            name.append(" ,Name: " + cn.name)
//            name.append(",Phone: " + cn.phoneNumber)
//            listcounter++
//        } else {
//            //Reset the Counter here
//            listcounter = 0
//        }
    }

    fun validateAddContact(){
        var name=binding.etName.text.toString()
        var email=binding.etEmail.text.toString()
        var phoneNumber=binding.etPhone.text.toString()
        var address=binding.etAddress.text.toString()
        var error= false
        //Validation
        if (name.isBlank()){
            binding.etName.error = "name required"
            error=true
        }
        if (email.isBlank()){
            binding.etEmail.error = "email required"
            error=true
        }
        if (phoneNumber.isBlank()){
            binding.etPhone.error = "phone number required"
            error=true
        }
        if (address.isBlank()){
            binding.etAddress.error = "address required"
            error=true
        }

        if (!error){
            startActivity(Intent(this,MainActivity::class.java))
        }

        val contact=Contact(contactId = 0,
            name = name,
            email = email,
            phoneNumber = phoneNumber,
            address = address,
            image = ""
        )
        contactsViewModel.saveContact(contact)
    }
}
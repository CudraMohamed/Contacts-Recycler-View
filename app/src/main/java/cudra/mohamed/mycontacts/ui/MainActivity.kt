package cudra.mohamed.mycontacts.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import cudra.mohamed.mycontacts.databinding.ActivityMainBinding
import cudra.mohamed.mycontacts.model.Contact
import cudra.mohamed.mycontacts.viewmodel.ContactsViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val contactsViewModel: ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        contactsViewModel.getAllContacts()
    }

    override fun onResume() {
        super.onResume()
        binding.fabContact.setOnClickListener {
            startActivity(Intent(this,AddContactActivity::class.java))
        }

        contactsViewModel.contactLiveData.observe(this, Observer { allContacts->
            displayContacts(allContacts)
        })
    }
    fun displayContacts(contacts:List<Contact>){
//        var contact13= Contact(13,"AJ","098675646","nshajksj@ghaja.com","6748 Nai lane","https://images.unsplash.com/photo-1547267347-ec6d11b7ba34?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
//        var contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13)
        var contactsAdapter = ContactRvAdapter(contacts)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter
    }
}
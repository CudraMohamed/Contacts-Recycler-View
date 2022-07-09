package cudra.mohamed.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import cudra.mohamed.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayContacts()
    }
    fun displayContacts(){
        var contact1=Contact("CM","7123456","nshajksj@ghaja.com","616 Korongo Rd.","")
        var contact2=Contact("RM","7123456","nshajksj@ghaja.com","reyweu","")
        var contact3=Contact("HM","7123456","nshajksj@ghaja.com","reyweu","")
        var contact4=Contact("AS","7123456","nshajksj@ghaja.com","reyweu","")
        var contact5=Contact("SH","7123456","nshajksj@ghaja.com","reyweu","")
        var contact6=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","")
        var contact7=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","")
        var contact8=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","")
        var contact9=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","")
        var contact10=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","")
        var contact11=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","")
        var contact12=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","")
        var contact13=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","")
        var contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13)
        var contactsAdapter = ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter
    }
}
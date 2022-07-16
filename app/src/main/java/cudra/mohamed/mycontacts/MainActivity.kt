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
        var contact1=Contact("CM","7123456","nshajksj@ghaja.com","616 Korongo Rd.","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact2=Contact("RM","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/phojhgfdto-1572224384995-f9529873f379?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact3=Contact("HM","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/photo-1539701938214-0d9736e1c16b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact4=Contact("AS","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact5=Contact("SH","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact6=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/photo-1536640712-4d4c36ff0e4e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjd8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact7=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/photo-1589156229687-496a31ad1d1f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjR8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact8=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/photo-1510736769521-207ed84f191e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjl8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact9=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/photo-1533435137002-455932c8538f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDR8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact10=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/photo-1548918901-9b31223c5c3a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NTJ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact11=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/photo-1521151716396-b2da27b1a19f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OTR8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact12=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/photo-1568675392503-1cf97bb81c23?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OTF8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact13=Contact("ZR","7123456","nshajksj@ghaja.com","reyweu","https://images.unsplash.com/photo-1547267347-ec6d11b7ba34?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13)
        var contactsAdapter = ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter
    }
}
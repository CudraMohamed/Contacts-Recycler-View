package cudra.mohamed.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import cudra.mohamed.mycontacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras=intent.extras
        val image=extras?.getString("IMAGE","")
        Picasso.get().load(image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_24)
            .resize(100,100)
            .centerCrop()
            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(binding.imgViewCon)

        val name=extras?.getString("NAME","")
        binding.tvNameView.text=name
        val email=extras?.getString("EMAIL","")
        binding.tvEmailView.text=email
        val phone=extras?.getString("PHONE","")
        binding.tvContactView.text=phone
        val address=extras?.getString("ADDRESS","")
        binding.tvAddressView.text=address

        Toast.makeText(this,"$name: $email",Toast.LENGTH_SHORT).show()
    }
}
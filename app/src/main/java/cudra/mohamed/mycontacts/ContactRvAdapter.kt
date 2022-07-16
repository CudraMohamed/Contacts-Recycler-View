package cudra.mohamed.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import cudra.mohamed.mycontacts.databinding.ContactListItemBinding

class ContactRvAdapter (var contactList:List<Contact>):
RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        var contactsViewHolder=ContactViewHolder(binding)
        return contactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {   //position->itemView
        var currentContact=contactList.get(position)
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvContact.text=currentContact.phoneNumber
        holder.binding.tvEmail.text=currentContact.email
        holder.binding.tvLocation.text=currentContact.address
        Picasso.get().load(currentContact.image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_24)
            .resize(100,100)
            .centerCrop()
            .into(holder.binding.ivContact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(var binding:ContactListItemBinding):RecyclerView.ViewHolder(binding.root){
}
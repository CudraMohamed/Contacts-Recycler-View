package cudra.mohamed.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactRvAdapter (var contactList:List<Contact>):
RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {   //position->itemView
        var currentContact=contactList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvContact.text=currentContact.phoneNumber
        holder.tvEmail.text=currentContact.email
        holder.tvLocation.text=currentContact.address
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvContact=itemView.findViewById<TextView>(R.id.tvContact)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var tvLocation=itemView.findViewById<TextView>(R.id.tvLocation)
}
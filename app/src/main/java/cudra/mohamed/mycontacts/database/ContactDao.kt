package cudra.mohamed.mycontacts.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import cudra.mohamed.mycontacts.model.Contact

@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContact(contact:Contact)

    @Query("SELECt * FROM contacts")
    fun getAllContacts(): LiveData<List<Contact>>

    @Query("SELECT * FROM contacts WHERE contactId= :contactId")
    fun getContactsById(contactId:Int):LiveData<Contact>
}
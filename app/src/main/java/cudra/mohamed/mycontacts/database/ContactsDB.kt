package cudra.mohamed.mycontacts.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import cudra.mohamed.mycontacts.model.Contact

@Database(entities = arrayOf(Contact::class), version = 1)
abstract class ContactsDB: RoomDatabase() {
    abstract fun contactDao():ContactDao    //gives us  access to the database//Room creates an object and access actual implementation of Dao interface

    companion object{
        private var database:ContactsDB?=null   //access the DB

        fun getDatabase(context: Context):ContactsDB{
            if(database==null){ //check if there is an existing database
                database= Room  //if not null-room is invoked to open a connection to the existing room
                    .databaseBuilder(context,ContactsDB::class.java,"ContactDB")
//                    .allowMainThreadQueries() //allows interraction with the thread
                    .fallbackToDestructiveMigration()   //updates the database by destroying the database and recreating it
                    .build()
            }
            return database as ContactsDB   //changes database to non-nullable //also use null assertion operator (!!)
        }
    }
}
package tm.ranjith.simpleroom24

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TempleDAO {

    @Insert
    suspend fun insertNewTemple(temple: Temple) // paused and resume // co routine


    //insert into Temple (TempleName, Location, MainGod)
// values ('Tirupathi','Andhra Pradesh','Lord Venkateswara')

}
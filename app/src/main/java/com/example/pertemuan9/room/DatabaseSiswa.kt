package com.example.pertemuan9.room

import androidx.room.RoomDatabase
import com.example.pertemuan9.room.Siswa
import com.example.pertemuan9.room.SiswaDao
import kotlinx.coroutines.flow.Flow
import androidx.room.Database
import android.content.Context
import androidx.room.Room


@Database(entities = [Siswa::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa : RoomDatabase() {
    abstract fun siswaDao() : SiswaDao

    companion object {
        @Volatile
        private var Instance: DatabaseSiswa? = null

        fun getDatabase(context: Context): DatabaseSiswa {
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(context,
                    DatabaseSiswa::class.java,
                    "siswa_database")
                    .build().also { Instance=it }

            })
        }
    }
}
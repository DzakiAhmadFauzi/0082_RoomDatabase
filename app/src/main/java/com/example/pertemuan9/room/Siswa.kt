package com.example.pertemuan9.room

import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity(tableName = "siswa")
data class Siswa (
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,

)
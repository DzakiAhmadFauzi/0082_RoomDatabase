package com.example.pertemuan9.repositori

import com.example.pertemuan9.room.Siswa
import kotlinx.coroutines.flow.Flow
import com.example.pertemuan9.room.SiswaDao


interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}


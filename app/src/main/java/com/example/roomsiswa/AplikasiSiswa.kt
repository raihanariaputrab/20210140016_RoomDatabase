package com.example.roomsiswa

import android.app.Application
import com.example.roomsiswa.RepositorySiswa.ContainerApp
import com.example.roomsiswa.RepositorySiswa.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override  fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}
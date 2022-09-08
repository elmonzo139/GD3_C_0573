package com.example.gd3_c_0573.entity

class Dosen(var name: String, var pengajar: String) {

    companion object{
        @JvmField
        var listOfDosen = arrayOf(
            Dosen("Fidelis Brian", "Pengajar kelas A, B, C"),
            Dosen("Thomas Adi", "Pengajar kelas C"),
        )
    }
}
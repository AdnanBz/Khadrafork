package com.example.myapplication

import android.R

data class simplearbrel(
    var arbername: String,
    var name: String,
    var imagearber: Int,


    )
fun getallarber(): List<simplearbrel>{
    return listOf<simplearbrel>(
        simplearbrel(arbername = "Pine tree", name = "pine",)


    )
}
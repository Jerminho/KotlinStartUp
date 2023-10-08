package com.example.todoapplicationdebut

class User(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val password: String,
    var isActive: Boolean = false
)

package com.bigrocket.fragments

import java.io.Serializable

data class User (
    var name: String,
    var age: Int
) : Serializable
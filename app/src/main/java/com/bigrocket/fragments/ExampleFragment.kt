package com.bigrocket.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ExampleFragment : Fragment(R.layout.fragment_example) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        var name = requireArguments().getString("NAME_USER")
//        var age = requireArguments().getInt("AGE_USER")

        var user = requireArguments().getSerializable("USER") as User

//        println("$name , $age <<<<<<<<<<<")
        println("${user.name} ${user.age} <<<<<<<<")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
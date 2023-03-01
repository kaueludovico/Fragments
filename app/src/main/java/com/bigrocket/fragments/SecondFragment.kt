package com.bigrocket.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val name = requireArguments().getString("USER_NAME")
        val age = requireArguments().getInt("USER_AGE")

        println("Nome: $name Idade: $age")

        getData("$name", age)
    }

    private fun getData(name: String, age: Int) {
        Thread(Runnable {
            Thread.sleep(1000)
            textView2.text = "$name $age"
        }).start()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
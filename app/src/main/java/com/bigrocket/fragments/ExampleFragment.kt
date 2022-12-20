package com.bigrocket.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_example.*

class ExampleFragment : Fragment(R.layout.fragment_example) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val user = requireArguments().getSerializable("USER") as User

        println("Nome: ${user.name}, \nIdade: ${user.age} ")

        getData(user)
    }


    fun getData(user: User) {
        Thread(Runnable {
            Thread.sleep(1000)
            textView.text = "${user.name} ${user.age}"
        }).start()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
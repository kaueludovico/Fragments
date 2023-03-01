package com.bigrocket.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.bigrocket.fragments.model.User
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val user = requireArguments().getSerializable("USER") as User
        println("Nome: ${user.name}, \nIdade: ${user.age} ")

        getData(user)
    }


    private fun getData(user: User) {
        Thread(Runnable {
            Thread.sleep(1000)
            textView1.text = "${user.name} ${user.age}"
        }).start()
    }
}
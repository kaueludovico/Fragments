package com.bigrocket.fragmentargs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            callFirstFragment()
            callSecondFragment()
        }
    }

    private fun callSecondFragment() {
        findViewById<Button>(R.id.fragment2).setOnClickListener {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<SecondFragment>(R.id.fragmentContainerView)
            }
        }
    }

    private fun callFirstFragment() {
        findViewById<Button>(R.id.fragment1).setOnClickListener {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FirstFragment>(R.id.fragmentContainerView)
            }
        }
    }
}
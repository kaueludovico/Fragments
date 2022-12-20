package com.bigrocket.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.core.os.persistableBundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            callFragment1()
            callFragment2()
        }
    }

    private fun callFragment1() {
        findViewById<Button>(R.id.fragment1).setOnClickListener {

            val bundle = bundleOf(
                "USER" to User("Kauê Ludovico", 22)
            )

            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<ExampleFragment>(R.id.fragmentContainerView, args = bundle)
            }
        }
    }

    private fun callFragment2() {
        findViewById<Button>(R.id.fragment2).setOnClickListener {

            val bundle = bundleOf(
                "USER_NAME" to "kaueludovico",
                "USER_AGE" to 22
            )

            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<SecondExampleFragment>(R.id.fragmentContainerView, args = bundle)
            }
        }
    }
}
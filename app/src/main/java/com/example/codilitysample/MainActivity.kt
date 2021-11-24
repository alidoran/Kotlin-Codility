package com.example.codilitysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    object TestPart {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }


}










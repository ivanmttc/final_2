package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class C_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_5)
    }

    fun page4(view: View){
        val intent = Intent(this, C_4::class.java )
        startActivity(intent)
    }

    fun page6(view: View){
        val intent = Intent(this, C_6::class.java )
        startActivity(intent)
    }
}
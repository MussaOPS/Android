package com.example.simplealarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDashboard(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("keyIdentifier",1)
        startActivity(intent)
    }




}
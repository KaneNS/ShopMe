package com.example.myfirstsideproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun displayToGetList(view: View){ // create new activity when button is clicked
        val intent = Intent(this, ToGetActivity::class.java)
        startActivity(intent)
    }

    fun displayAlreadyHaveList(view: View){

        startActivity(intent)
    }
}
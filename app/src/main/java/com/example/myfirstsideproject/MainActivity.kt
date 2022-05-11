package com.example.myfirstsideproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun displayToGetList(view: View){ // create new activity when button is clicked
        val intent = Intent(this, ToGetActivity::class.java)
        startActivity(intent)
    }

    fun displayAlreadyHaveList(view: View){

        startActivity(intent)
    }
}




// Functionality to be added:

// Drink water reminder
// Kitchen Calorie counter
// Barcode scanner
// sell by date reminders
// Recipe ideas created by items in kitchen ext: voting system for recipes created by users.
// Clubcard chooser: takes user to their clubcard app - vouchers/View points
//
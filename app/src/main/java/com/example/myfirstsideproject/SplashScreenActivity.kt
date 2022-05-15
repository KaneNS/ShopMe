package com.example.myfirstsideproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.TextView
import org.w3c.dom.Text


class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        // Texts
        val leftText = findViewById<TextView>(R.id.leftText)
        val rightText = findViewById<TextView>(R.id.rightText)
        val bottomText = findViewById<TextView>(R.id.bottomText)

        //Animations
        val leftAnimation = AnimationUtils.loadAnimation(this, R.anim.leftanimsplash)
        val rightAnimation = AnimationUtils.loadAnimation(this, R.anim.rightanimsplash)
        val bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottomanimsplash)

        leftText.startAnimation(leftAnimation)
        rightText.startAnimation(rightAnimation)
        bottomText.startAnimation(bottomAnimation)

        // Splash screen delay
        Handler().postDelayed({
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        },3000)

    }

    // Moved this to Home activity, MainActivity used for Splash Screen. Would not work other way round.
//    fun displayToGetList(view: View){ // create new activity when button is clicked
//        val intent = Intent(this, ToGetActivity::class.java)
//        startActivity(intent)
//    }
//
//    fun displayAlreadyHaveList(view: View){
//
//        startActivity(intent)
//    }
}




// Functionality to be added:

// Drink water reminder
// Kitchen Calorie counter
// Barcode scanner
// sell by date reminders
// Recipe ideas created by items in kitchen ext: voting system for recipes created by users.
// Clubcard chooser: takes user to their clubcard app - vouchers/View points
//
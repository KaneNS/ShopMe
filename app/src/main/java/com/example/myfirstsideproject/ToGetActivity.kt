package com.example.myfirstsideproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class ToGetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_get)

        // Variables
        val button3 = findViewById<Button>(R.id.button3)
        val itemToGetListEditText = findViewById<EditText>(R.id.itemToGetListEditText)
        val textView2 = findViewById<TextView>(R.id.textView2)


        // below code is to add on click
        // listener to our add name button
        button3.setOnClickListener{

            // below we have created
            // a new DBHelper class,
            // and passed context to it
            val db = DBHelper(this, null)

            // creating variables for values
            // in name and age edit texts
            val sItems = itemToGetListEditText.text.toString()

            // calling method to add
            // name to our database

            db.addItem(sItems)


            // at last, clearing edit texts
            itemToGetListEditText.text?.clear()
            textView2.text = "" // clear textview so doesn't display dup's
            val cursor = db.getItem()
            cursor!!.moveToFirst()

            ///////////////////////
            // Replacing the below with a cardview
            //////////////////////
            textView2.append(cursor.getString(cursor.getColumnIndex(DBHelper.Shopping_List_Item)) + "\n")
            while(cursor.moveToNext()){
                textView2.append(cursor.getString(cursor.getColumnIndex(DBHelper.Shopping_List_Item)) + "\n")
            }

            // at last we close our cursor
            cursor.close()
        }

    }
//    Need to store the item string when 'add' is pressed
//    when displaying shopping list, need to create a textview-swipecard
}
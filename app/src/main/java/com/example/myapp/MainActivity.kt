package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.toHtml
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // اسم لی اوت رو میگذاریم.
//      lateinit var binding: Activity2Binding
    var name = ""
    var phone = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //setContentView(binding.root)//این درسته و خلاصه است.
        binding.phoneAndName
    }


       //        setContentView(R.layout.activity_main)
    fun onButtonClick(view: View) {
        var askBox = findViewById<TextView>(R.id.phoneAndName)
        var getNameBox = findViewById<EditText>(R.id.username)
        var phoneBox = findViewById<EditText>(R.id.phone)
        var confirmButton = findViewById<Button>(R.id.submitBotton)
        var showBox = findViewById<TextView>(R.id.helloBox)
        confirmButton.setOnClickListener {
            if (getNameBox.text.toString().isBlank()) {
                getNameBox.error = "enter your name"
                showBox.setText(" دوباره تلاش کنید.")
            } else {
                phone = phoneBox.text.toString()
                name = getNameBox.text.toString()
                showBox.text = "hello $name"
            }

//        var phonenumberbox = findViewById<EditText>(R.id.phonenumber)
//        var nextbutton = findViewById<Button>(R.id.button2)
//        var shownumber =findViewById<TextView>(R.id.showNumber)
//        var userNumber = ""
//        nextbutton.setOnClickListener {userNumber = phonenumberbox.text.toString()
//            shownumber.setText("hello $userNumber")
        }


    }
}
package com.example.myapp

import android.content.Intent
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


        var button1 = binding.Button0
        var button2 = binding.button1
        var button3 = binding.button2
        var hospital1 = Hospital
        var doc1 = Doctor("Rayan" , 1, 21343)
        var doc2 = Doctor("Brono" , 2, 47292)
        var doc3 = Doctor("Arian" , 3, 84937)
        hospital1.addDoctor(doc1)
        hospital1.addDoctor(doc2)
        hospital1.addDoctor(doc3)
        button1.text = hospital1.doctorList[0].name
        button2.text = hospital1.doctorList[1].name
        button3.text = hospital1.doctorList[2].name
        button1.setOnClickListener {
            gotoActivity(1)
        }
        button2.setOnClickListener {
            gotoActivity(2)
        }
        button3.setOnClickListener {
            gotoActivity(3)
        }




    }

    fun gotoActivity(id: Int) {

        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("id",id )
        intent.putExtra("name", name)
        intent.putExtra("name", "name")

        intent.putExtra("phone",phone)

        startActivity(intent)
    }


    //        setContentView(R.layout.activity_main)
//    fun onButtonClick(view: View) {
//        var askBox = findViewById<TextView>(R.id.phoneAndName)
//        var getNameBox = findViewById<EditText>(R.id.username)
//        var phoneBox = findViewById<EditText>(R.id.phone)
//        var confirmButton = findViewById<Button>(R.id.submitButton)
//        var showBox = findViewById<TextView>(R.id.helloBox)
//        confirmButton.setOnClickListener {
//            if (getNameBox.text.toString().isBlank()) {
//                getNameBox.error = "enter your name"
//                showBox.setText(" دوباره تلاش کنید.")
//            } else {
//                phone = phoneBox.text.toString()
//                name = getNameBox.text.toString()
//                showBox.text = "hello $name"
//            }

//        var phonenumberbox = findViewById<EditText>(R.id.phonenumber)
//        var nextbutton = findViewById<Button>(R.id.button2)
//        var shownumber =findViewById<TextView>(R.id.showNumber)
//        var userNumber = ""
//        nextbutton.setOnClickListener {userNumber = phonenumberbox.text.toString()
//            shownumber.setText("hello $userNumber")

}

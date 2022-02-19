package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var homeButton = binding.home
      var docId =  intent.getIntExtra("id",0)
        var docName = intent.getStringExtra("name")
        var docPhone = intent.getLongExtra("phone",0)
        var hospital2 = Hospital
        binding.docName.text =  hospital2.getDoctor(docId).name
       binding.docId.text =  hospital2.getDoctor(docId).id.toString()
    }
}
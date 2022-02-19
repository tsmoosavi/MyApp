package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapp.databinding.FragmentDoctorInfoBinding


class DoctorInfo : Fragment() {
lateinit var binding:FragmentDoctorInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDoctorInfoBinding.inflate(inflater, container, false)
        binding.nameBoxFrag.text = hospital2.getDoctor(docId).name




        val view = binding.root
        return view
    }


}
package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapp.databinding.FragmentDoctorInfoBinding


class DoctorInfofragment : Fragment() {
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
       var doctorId=  activity?.intent?.getIntExtra("id",0)
        var doctorName = activity?.intent?.getStringExtra("name")
        var doctorPhone = activity?.intent?.getStringExtra("phone")
        var doc1 = activity?.intent?.getParcelableExtra<Doctor>("doctor")
        var doc2 = activity?.intent?.getParcelableExtra<Doctor>("doctor")
        var doc3 = activity?.intent?.getParcelableExtra<Doctor>("doctor")

        binding.nameBoxFrag.text = doc1?.name
        binding.idBoxFrag.text = doc1?.id.toString()
        binding.phoneBoxFrag.text = doc1?.phone.toString()
        binding.nameBoxFrag.text = doc2?.name
        binding.idBoxFrag.text = doc2?.id.toString()
        binding.phoneBoxFrag.text = doc2?.phone.toString()
        binding.nameBoxFrag.text = doc3?.name
        binding.idBoxFrag.text = doc3?.id.toString()
        binding.phoneBoxFrag.text = doc3?.phone.toString()






        val view = binding.root
        return view
    }


}
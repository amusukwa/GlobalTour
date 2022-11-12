package com.sriyank.globotour


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.FirebaseDatabase
import com.sriyank.globotour.city.GlobalCity


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class AddCityFragment : Fragment() {
    // TODO: Rename and change types of parameters
    // private lateinit var docRef: DatabaseReference


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return   inflater.inflate(R.layout.fragment_add_city, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val addButton = view.findViewById<Button>(R.id.add_city)
        addButton.setOnClickListener {
            val docRef = FirebaseDatabase.getInstance()

            val cityName = view.findViewById<EditText>(R.id.city_name)
            val countryName = view.findViewById<EditText>(R.id.country)

            val name = cityName.text.toString()
            val country = countryName!!.text.toString()


            val globalCity = GlobalCity(name,country)
            docRef.getReference("cities").child("globacities").push().setValue(globalCity)

        }
    }











}
package com.sriyank.globotour

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sriyank.globotour.city.CityAdapter
import com.sriyank.globotour.city.GlobalCity
import com.sriyank.globotour.city.VacationSpots

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class AddCityFragment : Fragment() {
    // TODO: Rename and change types of parameters
     private lateinit var docRef: DatabaseReference


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return   inflater.inflate(R.layout.fragment_add_city, container, false)
    }

    val addButton = view?.findViewById<Button>(R.id.add_city)!!.setOnClickListener {

        //val dcRef = FirebaseDatabase.getInstance().getReference().child("mentors")

        val cityName = view?.findViewById<Button>(R.id.city_name)
        val countryName = view?.findViewById<Button>(R.id.country)

        val name = cityName.toString()
        val country = countryName.text.toString()


        val globalCity:GlobalCity = GlobalCity(name,country)
        //docRef.setValue(mentor)

    }

    private fun setUpRecyclerView(view: View?) {
        val addButton = view?.findViewById<Button>(R.id.add_city)
        addButton!!.setOnClickListener {


            




        }

    }



}
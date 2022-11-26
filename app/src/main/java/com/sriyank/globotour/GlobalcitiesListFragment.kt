package com.sriyank.globotour

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.sriyank.globotour.city.CityAdapter
import com.sriyank.globotour.city.GlobalCity
import com.sriyank.globotour.city.NewCityAdapter
import com.sriyank.globotour.city.VacationSpots

// TODO: Rename parameter arguments, choose names that match


/**
 * A simple [Fragment] subclass.
 * Use the [GlobalcitiesListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GlobalcitiesListFragment : Fragment() {

    private lateinit var globalcitiesList: ArrayList<GlobalCity>
    private lateinit var NewCityAdapter: NewCityAdapter
    private lateinit var recyclerView: RecyclerView





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_globalcities_list, container, false)
        val view = inflater.inflate(R.layout.fragment_globalcities_list, container, false)
        displayCities()
        return view
    }

    private fun displayCities() {

        var docRef = FirebaseDatabase.getInstance()
        val context = requireContext()
        globalcitiesList =  arrayListOf<GlobalCity>()
        NewCityAdapter = NewCityAdapter(context, globalcitiesList)
        val recyclerView =  view?.findViewById<RecyclerView>(R.id.recycler_list)
       // recyclerView?.adapter = NewCityAdapter

        val adapter = NewCityAdapter(context, globalcitiesList)
        //recyclerView?.adapter = adapter
        docRef.getReference("cities").child("globacities").
        addValueEventListener(object:ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    for(mentorSnapshot in snapshot.children){
                        val globalcity = snapshot.getValue(GlobalCity::class.java)
                        Log.d(ContentValues.TAG,"error getting document   ${globalcity}")
                        globalcitiesList.add(globalcity!!)
                    }
                    recyclerView?.adapter = NewCityAdapter(context,globalcitiesList)
                }

            }

            override fun onCancelled(error: DatabaseError) {
                Log.d(ContentValues.TAG,"error getting document")
            }
        })




    }


}
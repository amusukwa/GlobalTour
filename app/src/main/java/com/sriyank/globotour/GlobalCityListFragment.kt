package com.sriyank.globotour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class GlobalCityListFragment : Fragment() {
    // TODO: Rename and change types of parameters


       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_global_city_list, container, false)
        setUpRecyclerView(view)
        return view
    }

    private fun setUpRecyclerView(view: View?) {

        TODO("Not yet implemented")
    }



}
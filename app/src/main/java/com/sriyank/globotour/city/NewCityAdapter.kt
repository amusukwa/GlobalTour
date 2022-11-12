package com.sriyank.globotour.city

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sriyank.globotour.R

class NewCityAdapter(val context: Context,  private var globalcityList:  ArrayList<GlobalCity>) :
    RecyclerView.Adapter<NewCityAdapter.CityViewHolder>() {

    inner class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

      //  private var currentPosition: Int = -1
      //  private var currentCity: GlobalCity? = null

        private val textCityName = itemView.findViewById<TextView>(R.id.city_name_text)
        private val countryName = itemView.findViewById<TextView>(R.id.country_text)


        fun bind(globalCity: GlobalCity, position: Int) {

            textCityName.text = globalCity.city
            countryName.text = globalCity.country

        }


        override fun onClick(v: View?) {

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.globalcity_item, parent, false)
        return CityViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val globalCity = globalcityList[position]
        holder.bind(globalCity, position)

    }

    override fun getItemCount(): Int {
        return globalcityList.size
    }
}
package com.jpixphotoeditor.recyclerviewvertical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var foodAdapter: FoodAdapter
    lateinit var foodList: ArrayList<Food>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        foodList = ArrayList()

        addDataToList()

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

    }

    private fun addDataToList(){
        foodList.add(Food(R.drawable.butter_masala,"Paneer Butter"))
        foodList.add(Food(R.drawable.pizza,"Pizza"))
        foodList.add(Food(R.drawable.dosa,"Dosa"))
        foodList.add(Food(R.drawable.pasta,"Pasta"))
        foodList.add(Food(R.drawable.noodles,"Noodles"))
        foodList.add(Food(R.drawable.veg_biryani,"Veg Biryani"))

        foodList.add(Food(R.drawable.butter_masala,"Paneer Butter"))
        foodList.add(Food(R.drawable.pizza,"Pizza"))
        foodList.add(Food(R.drawable.dosa,"Dosa"))
        foodList.add(Food(R.drawable.pasta,"Pasta"))
        foodList.add(Food(R.drawable.noodles,"Noodles"))
        foodList.add(Food(R.drawable.veg_biryani,"Veg Biryani"))
    }
}
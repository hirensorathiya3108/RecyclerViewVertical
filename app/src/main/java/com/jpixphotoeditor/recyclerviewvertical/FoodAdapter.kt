package com.jpixphotoeditor.recyclerviewvertical

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(val foodList:List<Food>):RecyclerView.Adapter<FoodAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val foodImage = itemView.findViewById<AppCompatImageView>(R.id.imageView)
        val foodName = itemView.findViewById<AppCompatTextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = foodList[position]
        holder.foodName.text = item.foodName
        holder.foodImage.setImageResource(item.foodImage)
    }

    override fun getItemCount(): Int {
      return foodList.size
    }

}
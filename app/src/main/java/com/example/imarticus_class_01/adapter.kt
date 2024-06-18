package com.example.imarticus_class_01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter(var kin:ArrayList<String>):RecyclerView.Adapter<adapter.Viewholder>() {
    class Viewholder(lay: View) :RecyclerView.ViewHolder(lay) {
        val textl:TextView=lay.findViewById(R.id.textView5)
    }

    override fun onCreateViewHolder(parent: ViewGroup , viewType: Int): Viewholder {

        val lay=LayoutInflater.from(parent.context).inflate(R.layout.info,parent,false)
        return Viewholder(lay)
    }

    override fun getItemCount(): Int {
       return kin.size
    }

    override fun onBindViewHolder(holder: Viewholder , position: Int) {
      //  val data=kin[position]
        holder.textl.text=kin[position]
    }
}
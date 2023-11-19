package com.example.newtask

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class Myadapter(val data:List<StoreData>) :
    RecyclerView.Adapter<Myadapter.MyViewHolder>()
{

    class MyViewHolder(val row: View, private  val data: List<StoreData>) : RecyclerView.ViewHolder(row)
    {
        val image=row.findViewById<ImageView>(R.id.imagee)
        val textt=row.findViewById<TextView>(R.id.text1)
        val cardd = row.findViewById<CardView>(R.id.mycard)
        init {
            cardd.setOnClickListener{
                val intent=Intent(row.context , MainActivity2::class.java)
                intent.putExtra("imageRe",  data[adapterPosition].image)
                intent.putExtra("name", data[adapterPosition].name)
                row.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout=
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return MyViewHolder(layout, data)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item=data[position]
        holder.textt.text=item.name
        //holder.image.setImageResource(item.image)
        Glide.with(holder.image)
            .load(item.image)
            .into(holder.image)
    }

    override fun getItemCount(): Int = data.size
}

//private fun ImageView.setImageResource(image: String?) {

//}

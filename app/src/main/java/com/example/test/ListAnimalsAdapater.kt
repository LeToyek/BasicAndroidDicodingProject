package com.example.test

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAnimalsAdapater(private val listAnimal : ArrayList<Animals>,
private val context: Context) : RecyclerView.Adapter<ListAnimalsAdapater.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback
    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvNama : TextView = itemView.findViewById(R.id.tvNama)
        var tvDetail : TextView = itemView.findViewById(R.id.tvDetail)
        var imageAnimal : ImageView = itemView.findViewById(R.id.imageKewan)
        var cardAnimal : CardView = itemView.findViewById(R.id.card_koala)
    }
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i : Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_cardview_animal,viewGroup,false)
        return ListViewHolder((view))
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val animal = listAnimal[position]

        Glide.with(holder.itemView.context)
            .load(animal.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imageAnimal)

        holder.tvNama.text = animal.name
        holder.tvDetail.text = animal.detail
        holder.cardAnimal.setOnClickListener{
            context.startActivity(Intent(context,DetailActivity::class.java))
        }
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listAnimal[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listAnimal.size
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Animals)
    }
}
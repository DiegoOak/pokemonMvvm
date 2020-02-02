package com.example.pokemonmvvmsample.view.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonmvvmsample.service.model.Result
import com.example.pokemonmvvmsample.view.callback.OnRecyclerViewClickListener
import kotlinx.android.synthetic.main.item_pokemon.view.*

class ResultViewHolder(view: View): RecyclerView.ViewHolder(view) {
    fun bind(item: Result, listener: OnRecyclerViewClickListener<Result>) {
        itemView.pokemonName.text = item.name

        itemView.setOnClickListener {
            listener.onItemClick(item)
        }
    }
}
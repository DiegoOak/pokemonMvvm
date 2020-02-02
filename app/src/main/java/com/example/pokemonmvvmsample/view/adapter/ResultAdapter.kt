package com.example.pokemonmvvmsample.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonmvvmsample.R
import com.example.pokemonmvvmsample.service.model.Result
import com.example.pokemonmvvmsample.view.callback.OnRecyclerViewClickListener

class ResultAdapter(
    private val pokemonList: List<Result>,
    private val listener: OnRecyclerViewClickListener<Result>
) : RecyclerView.Adapter<ResultViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ResultViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_pokemon, parent, false)
        )

    override fun getItemCount(): Int = pokemonList.size

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        holder.bind(pokemonList[position], listener)
    }
}
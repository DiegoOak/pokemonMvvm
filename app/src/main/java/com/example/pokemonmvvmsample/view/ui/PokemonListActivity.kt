package com.example.pokemonmvvmsample.view.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.pokemonmvvmsample.viewModel.PokemonListViewModel
import com.example.pokemonmvvmsample.R
import com.example.pokemonmvvmsample.service.model.PokemonList
import com.example.pokemonmvvmsample.service.model.Result
import com.example.pokemonmvvmsample.view.adapter.ResultAdapter
import com.example.pokemonmvvmsample.view.callback.OnRecyclerViewClickListener
import kotlinx.android.synthetic.main.activity_main.*

class PokemonListActivity : AppCompatActivity(), OnRecyclerViewClickListener<Result> {

    private lateinit var  viewModel: PokemonListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(PokemonListViewModel::class.java)
        observeViewModel(viewModel)
    }

    private fun observeViewModel(viewModel: PokemonListViewModel) {
        viewModel.getPokemonsObservable().observe(this, Observer<PokemonList>{
            pokemonList.adapter = ResultAdapter(it.results, this)
        })
    }

    override fun onItemClick(item: Result) {
        val intent = Intent(this, PokemonDetailActivity::class.java)
        intent.putExtra("url", item.url)
        startActivity(intent)
    }
}

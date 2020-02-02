package com.example.pokemonmvvmsample.view.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.pokemonmvvmsample.R
import com.example.pokemonmvvmsample.utils.GlideUtils
import com.example.pokemonmvvmsample.viewModel.PokemonDetailViewModel
import com.example.pokemvvmsample.service.model.Pokemon
import kotlinx.android.synthetic.main.activity_pokemon_detail.*

class PokemonDetailActivity : AppCompatActivity() {

    private lateinit var viewModel: PokemonDetailViewModel

    private var url = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_detail)
        viewModel = ViewModelProviders.of(this).get(PokemonDetailViewModel::class.java)
        url = intent.getStringExtra("url")
        observeViewModel(viewModel)
    }

    private fun observeViewModel(viewModel: PokemonDetailViewModel) {
        viewModel.getPokemonDetails(url)
        viewModel.getPokemonDetailsObserver().observe(this, Observer<Pokemon> {
                pokemonDetailName.text = it.name
                GlideUtils.loadImage(pokemonDetailImage, it.sprites.frontDefault)
                pokemonTypeDesc.text = it.types?.get(0)?.typeDesc?.name
                pokemonHeightDesc.text = it.height.toString()
                pokemonWeightDesc.text = it.weight.toString()
            })
    }
}

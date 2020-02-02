package com.example.pokemonmvvmsample.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokemvvmsample.service.model.Pokemon
import com.example.pokemvvmsample.service.repository.PokemonRepository

class PokemonDetailViewModel: ViewModel() {

    private var pokemonRepository: PokemonRepository = PokemonRepository()

    private var pokemonObservable = MutableLiveData<Pokemon>()

    fun getPokemonDetails(url: String) {
        val id = url.substring(34, url.length)
        pokemonObservable = pokemonRepository.getPokemonDetails(id)

    }

    fun getPokemonDetailsObserver(): LiveData<Pokemon> {
        return pokemonObservable
    }

}
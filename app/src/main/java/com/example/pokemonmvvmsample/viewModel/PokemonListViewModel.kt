package com.example.pokemonmvvmsample.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokemonmvvmsample.service.model.PokemonList
import com.example.pokemvvmsample.service.model.Pokemon
import com.example.pokemvvmsample.service.repository.PokemonRepository

class PokemonListViewModel : ViewModel() {

    var pokemonRepository: PokemonRepository = PokemonRepository()

    private var pokemonsObservable =  MutableLiveData<PokemonList>()


    fun getPokemonsList() {
        pokemonsObservable = pokemonRepository.getPokemonList()
    }

    fun getPokemonsObservable(): LiveData<PokemonList> {
        getPokemonsList()
        return pokemonsObservable
    }
}
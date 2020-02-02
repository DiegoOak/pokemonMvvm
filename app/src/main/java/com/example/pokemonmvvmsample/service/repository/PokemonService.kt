package com.example.pokemvvmsample.service.repository

import com.example.pokemonmvvmsample.service.model.PokemonList
import com.example.pokemvvmsample.service.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {

    companion object {
        const val pokemon = "pokemon/"
    }

    @GET("pokemon?limit=151")
    fun getPokemonList(): Call<PokemonList>

    @GET(pokemon + "{id}")
    fun getPokemonDetails(@Path(value = "id") id: String): Call<Pokemon>
}


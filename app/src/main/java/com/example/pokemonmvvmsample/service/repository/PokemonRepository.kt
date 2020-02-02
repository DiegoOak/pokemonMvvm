package com.example.pokemvvmsample.service.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.pokemonmvvmsample.service.model.PokemonList
import com.example.pokemvvmsample.service.model.Pokemon
import com.example.pokemvvmsample.service.retrofit.RetrofitBase
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonRepository {

    private val RetrofitBase = RetrofitBase()

    private val pokemonList: MutableLiveData<PokemonList> = MutableLiveData()
    private val pokemon: MutableLiveData<Pokemon> = MutableLiveData()

    fun getPokemonList(): MutableLiveData<PokemonList> {
        RetrofitBase.getInstance()?.getPokemonList()?.enqueue(object : Callback<PokemonList> {
            override fun onResponse(
                call: Call<PokemonList>,
                response: Response<PokemonList>
            ) {
                response.let {
                    pokemonList.value = it.body()
                }
            }

            override fun onFailure(call: Call<PokemonList>, t: Throwable) {
                Log.e("error getPokemonList", t.message)
            }

        })

        return pokemonList
    }

    fun getPokemonDetails(id: String): MutableLiveData<Pokemon> {
        RetrofitBase.getInstance()?.getPokemonDetails(id)?.enqueue(object : Callback<Pokemon> {
            override fun onResponse(
                call: Call<Pokemon>,
                response: Response<Pokemon>
            ) {
                response.let {
                    pokemon.value = it.body()
                }
            }

            override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                Log.e("error getPokemonDetails", t.message)
            }
        })
        return pokemon
    }
}
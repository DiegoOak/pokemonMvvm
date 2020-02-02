package com.example.pokemvvmsample.service.retrofit

import com.example.pokemonmvvmsample.BuildConfig
import com.example.pokemvvmsample.service.repository.PokemonService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBase {

    private var retrofit: Retrofit? = null

    fun getInstance(): PokemonService? {
        return createInstance()
    }


    private fun createInstance(): PokemonService? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.API_HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        return retrofit?.create(PokemonService::class.java)
    }
}
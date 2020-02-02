package com.example.pokemonmvvmsample.service.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

data class PokemonList (
    @SerializedName("count")
    @Expose
    val count: Int? = null,
    @SerializedName("next")
    @Expose
    val next: String? = null,
    @SerializedName("previous")
    @Expose
    val previous: Any? = null,
    @SerializedName("results")
    @Expose
    val results: List<Result>
)
package com.example.pokemonmvvmsample.service.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




data class Ability_ (
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("url")
    @Expose
    val url: String? = null
)
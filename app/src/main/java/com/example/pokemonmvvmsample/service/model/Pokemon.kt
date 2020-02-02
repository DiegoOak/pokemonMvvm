package com.example.pokemvvmsample.service.model

import com.example.pokemonmvvmsample.service.model.Ability
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Pokemon (
    @SerializedName("id")
    @Expose
    val id: Int? = null,
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("base_experience")
    @Expose
    val baseExperience: Int? = null,
    @SerializedName("height")
    @Expose
    val height: Int? = null,
    @SerializedName("is_default")
    @Expose
    val isDefault: Boolean? = null,
    @SerializedName("order")
    @Expose
    val order: Int? = null,
    @SerializedName("weight")
    @Expose
    val weight: Int? = null,
    @SerializedName("abilities")
    @Expose
    val abilities: List<Ability>? = null,
    @SerializedName("sprites")
    @Expose
    val sprites: Sprites,
    @SerializedName("stats")
    @Expose
    val stats: List<Status>? = null,
    @SerializedName("types")
    @Expose
    val types: List<Type>? =
        null
)
package com.example.pokemonmvvmsample.service.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Ability (
    @SerializedName("is_hidden")
    @Expose
    val isHidden: Boolean? = null,
    @SerializedName("slot")
    @Expose
    val slot: Int? = null,
    @SerializedName("ability")
    @Expose
    val ability: Ability_? = null
)
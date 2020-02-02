package com.example.pokemvvmsample.service.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Type (
    @SerializedName("slot")
    @Expose
    val slot: Int? = null,
    @SerializedName("type")
    @Expose
    val typeDesc: TypeDesc? = null
)
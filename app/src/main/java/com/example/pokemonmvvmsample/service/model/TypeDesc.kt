package com.example.pokemvvmsample.service.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TypeDesc (
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("url")
    @Expose
    val url: String? = null
)
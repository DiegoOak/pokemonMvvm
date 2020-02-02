package com.example.pokemvvmsample.service.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Status (
    @SerializedName("base_stat")
    @Expose
    val baseStat: Int? = null,
    @SerializedName("effort")
    @Expose
    val effort: Int? = null,
    @SerializedName("stat")
    @Expose
    val statusDesc: StatusDesc? = null
)
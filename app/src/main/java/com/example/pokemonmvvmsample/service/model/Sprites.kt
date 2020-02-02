package com.example.pokemvvmsample.service.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Sprites (
    @SerializedName("back_default")
    @Expose
    val backDefault: String? = null,
    @SerializedName("back_female")
    @Expose
    val backFemale: Any? = null,
    @SerializedName("back_shiny")
    @Expose
    val backShiny: String? = null,
    @SerializedName("back_shiny_female")
    @Expose
    val backShinyFemale: Any? = null,
    @SerializedName("front_default")
    @Expose
    val frontDefault: String,
    @SerializedName("front_female")
    @Expose
    val frontFemale: Any? = null,
    @SerializedName("front_shiny")
    @Expose
    val frontShiny: String? = null,
    @SerializedName("front_shiny_female")
    @Expose
    val frontShinyFemale: Any? = null
)
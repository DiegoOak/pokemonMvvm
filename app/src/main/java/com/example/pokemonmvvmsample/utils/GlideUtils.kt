package com.example.pokemonmvvmsample.utils

import android.widget.ImageView
import com.bumptech.glide.Glide

class GlideUtils {

    companion object {
        fun loadImage(imageView: ImageView, url: String) {
            Glide.with(imageView.context).load(url).into(imageView)
        }
    }

}
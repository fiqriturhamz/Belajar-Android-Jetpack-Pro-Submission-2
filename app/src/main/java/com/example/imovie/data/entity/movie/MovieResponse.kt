package com.example.imovie.data.entity.movie

import com.google.gson.annotations.SerializedName

data class MovieResponse(

    @field:SerializedName("results")
    var results: List<MovieEntity>? = null

)

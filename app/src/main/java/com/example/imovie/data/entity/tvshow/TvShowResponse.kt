package com.example.imovie.data.entity.tvshow

import com.google.gson.annotations.SerializedName

data class TvShowResponse(

    @field:SerializedName("results")
    val results: List<TvShowEntity>? = null,

    )
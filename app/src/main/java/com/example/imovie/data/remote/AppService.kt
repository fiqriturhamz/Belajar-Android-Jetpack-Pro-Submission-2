package com.example.imovie.data.remote

import com.example.imovie.data.entity.movie.MovieEntity
import com.example.imovie.data.entity.movie.MovieResponse
import com.example.imovie.data.entity.tvshow.TvShowEntity
import com.example.imovie.data.entity.tvshow.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AppService {
    @GET("movie/popular")
    fun getPopularMovies(@Query("api_key") apiKey: String?): Call<MovieResponse>

    @GET("movie/{id}")
    fun getMovie(
        @Path("id") id: Int?,
        @Query("api_key") apiKey: String?
    ): Call<MovieEntity>

    @GET("tv/popular")
    fun getPopularTvShow(@Query("api_key") apiKey: String?): Call<TvShowResponse>

    @GET("tv/{id}")
    fun getTvShow(
        @Path("id") id: Int?,
        @Query("api_key") apiKey: String?
    ): Call<TvShowEntity>
}
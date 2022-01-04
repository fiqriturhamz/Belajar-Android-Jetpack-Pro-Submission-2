package com.example.imovie.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.imovie.data.entity.movie.MovieEntity
import com.example.imovie.data.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val repository: AppRepository
) : ViewModel() {

    fun getMovies(): LiveData<List<MovieEntity>> = repository.getPopularMovies()

}
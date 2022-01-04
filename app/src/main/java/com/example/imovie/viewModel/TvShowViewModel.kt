package com.example.imovie.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.imovie.data.entity.tvshow.TvShowEntity
import com.example.imovie.data.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TvShowViewModel @Inject constructor(
    private val repository: AppRepository
) : ViewModel() {

    fun getTvShows(): LiveData<List<TvShowEntity>> = repository.getPopularTvShow()

}
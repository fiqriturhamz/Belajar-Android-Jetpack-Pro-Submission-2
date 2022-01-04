package com.example.imovie.ui.tvshow.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.example.imovie.BuildConfig.BASE_IMAGE_URL
import com.example.imovie.databinding.ActivityTvShowDetailBinding
import com.example.imovie.viewModel.TvShowDetailViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class TvShowDetailActivity : AppCompatActivity() {
    companion object {
        const val ID = "ID"
    }

    private val viewModel: TvShowDetailViewModel by viewModels()
    private lateinit var binding: ActivityTvShowDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTvShowDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent?.getIntExtra("ID", 0)?.let {
            getTvShow(it)
        }
    }


    private fun getTvShow(id: Int) {
        viewModel.getTvShow(id).observe(this, { item ->
            if (item != null) {
                binding.progressBar.visibility = View.GONE
                binding.tvTvshows.visibility = View.VISIBLE
                binding.tvRatingTvShows.visibility = View.VISIBLE
                binding.tvReleaseDateTvShow.visibility=View.VISIBLE
                binding.tvDesTvshows.visibility=View.VISIBLE
                binding.tvSynopsis.visibility=View.VISIBLE

                Glide.with(binding.root)
                    .load(BASE_IMAGE_URL + item.posterPath)
                    .into(binding.ivTvshows)

                binding.tvTvshows.text = item.name
                binding.tvDesTvshows.text = item.overview
                binding.tvRatingTvShows.text = item.voteAverage.toString()
                binding.tvReleaseDateTvShow.text = item.firstAirDate


            }
        })
    }
}
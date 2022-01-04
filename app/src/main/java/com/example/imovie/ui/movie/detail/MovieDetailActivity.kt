package com.example.imovie.ui.movie.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.example.imovie.BuildConfig.BASE_IMAGE_URL
import com.example.imovie.databinding.ActivityMovieDetailBinding
import com.example.imovie.viewModel.MovieDetailViewModel
import dagger.hilt.android.AndroidEntryPoint
@AndroidEntryPoint
class MovieDetailActivity : AppCompatActivity() {
    companion object {
        const val ID = "ID"
    }

    private val viewModel: MovieDetailViewModel by viewModels()
    private lateinit var binding: ActivityMovieDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent?.getIntExtra(ID, 0)?.let {
            getMovie(it)
        }
    }

    private fun getMovie(id: Int) {

        viewModel.getMovie(id).observe(this, { item ->
            if (item != null) {
                binding.progressBar.visibility = View.GONE
                binding.tvMovie.visibility = View.VISIBLE
                binding.tvRating.visibility = View.VISIBLE
                binding.ivPoster.visibility = View.VISIBLE
                binding.tvReleaseDate.visibility = View.VISIBLE
                binding.tvDes.visibility=View.VISIBLE
                binding.tvSynopsis.visibility=View.VISIBLE

                Glide
                    .with(binding.root)
                    .load(BASE_IMAGE_URL + item.posterPath)
                    .into(binding.ivPoster)


                binding.tvMovie.text = item.title
                binding.tvDes.text = item.overview
                binding.tvRating.text = item.voteAverage.toString()
                binding.tvReleaseDate.text = item.releaseDate


            }
        })
    }

}


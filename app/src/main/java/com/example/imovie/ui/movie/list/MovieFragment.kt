package com.example.imovie.ui.movie.list

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imovie.adapter.MovieAdapter
import com.example.imovie.databinding.MovieFragmentBinding
import com.example.imovie.ui.movie.detail.MovieDetailActivity
import com.example.imovie.viewModel.MovieViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieFragment : Fragment(), MovieAdapter.MovieItemListener {

    private val viewModel: MovieViewModel by viewModels()
    private var _binding: MovieFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: MovieAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MovieFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        getMovies()
    }

    private fun setupRecyclerView() {
        adapter = MovieAdapter(this)
        with(binding) {
            rvMovie.layoutManager = LinearLayoutManager(requireContext())
            rvMovie.adapter = adapter
        }
    }

    private fun getMovies() {
        viewModel.getMovies().observe(viewLifecycleOwner, { movies ->
            binding.progressBar.visibility = View.GONE
            adapter.setItems(ArrayList(movies))
        })
    }


    override fun onClicked(movieId: Int?) {
        val intent = Intent(requireContext(), MovieDetailActivity::class.java)
        intent.putExtra(MovieDetailActivity.ID, movieId)
        startActivity(intent)
    }

}
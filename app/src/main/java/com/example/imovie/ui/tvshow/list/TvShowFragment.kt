package com.example.imovie.ui.tvshow.list

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imovie.adapter.TvShowAdapter
import com.example.imovie.ui.tvshow.detail.TvShowDetailActivity
import com.example.imovie.databinding.TvShowFragmentBinding
import com.example.imovie.viewModel.TvShowViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class TvShowFragment : Fragment(), TvShowAdapter.TvShowItemListener {

    private val viewModel: TvShowViewModel by viewModels()
    private var _binding: TvShowFragmentBinding? = null
    private val binding get()=_binding!!
    private lateinit var adapter: TvShowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = TvShowFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        getTvShows()
    }

    private fun setupRecyclerView() {
        adapter = TvShowAdapter(this)
        with(binding) {
            rvTvShow.layoutManager = LinearLayoutManager(requireContext())
            rvTvShow.adapter = adapter
        }
    }

    private fun getTvShows() {
        viewModel.getTvShows().observe(viewLifecycleOwner, {
            binding.progressBar.visibility = View.GONE
            adapter.setItems(ArrayList(it))
        })
    }

    override fun onClicked(tvShowId: Int?) {
        val intent = Intent(requireContext(), TvShowDetailActivity::class.java)
        intent.putExtra(TvShowDetailActivity.ID, tvShowId)
        startActivity(intent)
    }

}
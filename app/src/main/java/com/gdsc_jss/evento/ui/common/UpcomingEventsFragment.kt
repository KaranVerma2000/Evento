package com.gdsc_jss.evento.ui.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.gdsc_jss.evento.databinding.FragmentUpcomingEventsBinding
import com.gdsc_jss.evento.viewmodels.UpcomingEventsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UpcomingEventsFragment : Fragment() {

    private lateinit var binding: FragmentUpcomingEventsBinding
    private val viewModel: UpcomingEventsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUpcomingEventsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.upcomingEventsList.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = EventsAdapter(arrayListOf())
        }
    }
}
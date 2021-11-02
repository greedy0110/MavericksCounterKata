package com.greedy0110.mvrxcounter.counter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airbnb.mvrx.MavericksView
import com.airbnb.mvrx.fragmentViewModel
import com.airbnb.mvrx.withState
import com.greedy0110.mvrxcounter.databinding.FragmentCounterBinding

class CounterFragment : Fragment(), MavericksView {

    private lateinit var binding: FragmentCounterBinding
    private val counterViewModel: CounterViewModel by fragmentViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCounterBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textCount.setOnClickListener { counterViewModel.incrementCounter() }
    }

    override fun invalidate() = withState(counterViewModel) { state ->
        binding.textCount.text = state.count.toString()
    }
}
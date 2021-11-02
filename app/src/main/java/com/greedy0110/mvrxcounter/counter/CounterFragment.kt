package com.greedy0110.mvrxcounter.counter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.greedy0110.mvrxcounter.databinding.FragmentCounterBinding

class CounterFragment : Fragment() {

    private lateinit var binding: FragmentCounterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCounterBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}
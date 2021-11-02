package com.greedy0110.mvrxcounter.selector

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.greedy0110.mvrxcounter.R
import com.greedy0110.mvrxcounter.databinding.FragmentSelectorCounterBinding

// 이 클래스는 State가 없다. 그냥 Fragment를 사용하고 다른 Counter로 랜딩하는 역할만 하는 것.
class SelectorCounterFragment : Fragment() {

    private lateinit var binding: FragmentSelectorCounterBinding
    private val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectorCounterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {
            navController.navigate(R.id.action_selectorCounterFragment_to_counterFragment1)
        }
        binding.button2.setOnClickListener {
            navController.navigate(R.id.action_selectorCounterFragment_to_counterFragment2)
        }
        binding.button3.setOnClickListener {
            navController.navigate(R.id.action_selectorCounterFragment_to_counterFragment3)
        }
    }
}
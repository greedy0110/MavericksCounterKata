package com.greedy0110.mvrxcounter

import com.airbnb.mvrx.test.MvRxTestRule
import com.airbnb.mvrx.withState
import com.greedy0110.mvrxcounter.counter.CounterState
import com.greedy0110.mvrxcounter.counter.CounterViewModel
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class CounterViewModelTest {

    @get:Rule
    val mvrxTestRule = MvRxTestRule()

    @Test
    fun addition_isCorrect() {
        val viewModel = CounterViewModel(CounterState())
        viewModel.incrementCounter()
        withState(viewModel) { state ->
            assertEquals(1, state.count)
        }
    }
}
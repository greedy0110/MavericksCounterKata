package com.greedy0110.mvrxcounter.counter

import com.airbnb.mvrx.MavericksState

data class CounterState(
    val count: Int = 0
) : MavericksState
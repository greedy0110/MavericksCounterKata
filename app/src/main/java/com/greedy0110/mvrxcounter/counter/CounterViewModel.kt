package com.greedy0110.mvrxcounter.counter

import com.airbnb.mvrx.MavericksViewModel

class CounterViewModel(init: CounterState) : MavericksViewModel<CounterState>(init) {

    fun incrementCounter() = setState { copy(count = count + 1) }
}
package com.example.counter

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

/** Holds the counter screen's state, so the count survives configuration changes. */
class CounterViewModel : ViewModel() {
    /** How many times the counter has been increased. */
    var count by mutableIntStateOf(0)
        private set

    /** Increases the count by one. */
    fun increment() {
        count++
    }
}

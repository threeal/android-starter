package com.example.counter

import kotlin.test.Test
import kotlin.test.assertEquals

class CounterViewModelTest {
    @Test
    fun `increments the count`() {
        val viewModel = CounterViewModel()
        assertEquals(0, viewModel.count)
        viewModel.increment()
        assertEquals(1, viewModel.count)
    }
}

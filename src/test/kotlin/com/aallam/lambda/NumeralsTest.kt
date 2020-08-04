package com.aallam.lambda

import kotlin.test.Test
import kotlin.test.assertEquals

class NumeralsTest {

    @Test
    fun once() {
        assertEquals(FALSE, ONCE(NOT)(TRUE))
    }

    @Test
    fun twice() {
        assertEquals(TRUE, TWICE(NOT)(TRUE))
    }

    @Test
    fun thrice() {
        assertEquals(FALSE, THRICE(NOT)(TRUE))
    }
}

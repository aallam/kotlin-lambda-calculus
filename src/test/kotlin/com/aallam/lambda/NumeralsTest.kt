package com.aallam.lambda

import kotlin.test.Test
import kotlin.test.assertEquals

class NumeralsTest {

    @Test
    fun zero() {
        assertEquals(TRUE, ZERO(NOT)(TRUE))
    }

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

    @Test
    fun fourfold() {
        assertEquals(TRUE, FOURFOLD(NOT)(TRUE))
    }

    @Test
    fun fivefold() {
        assertEquals(FALSE, FIVEFOLD(NOT)(TRUE))
    }
}

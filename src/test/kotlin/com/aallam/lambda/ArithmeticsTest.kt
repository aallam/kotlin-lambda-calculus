package com.aallam.lambda

import kotlin.test.Test
import kotlin.test.assertEquals

class ArithmeticsTest {

    @Test
    fun succ() {
        assertEquals(ONCE(NOT)(TRUE), SUCC(ZERO)(NOT)(TRUE))
        assertEquals(TWICE(NOT)(TRUE), SUCC(SUCC)(ZERO)(NOT)(TRUE))
        assertEquals(THRICE(NOT)(TRUE), SUCC(SUCC)(SUCC)(ZERO)(NOT)(TRUE))
    }
}
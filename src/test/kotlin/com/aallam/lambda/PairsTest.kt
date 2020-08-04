package com.aallam.lambda

import kotlin.test.Test
import kotlin.test.assertEquals

class PairsTest {

    @Test
    fun pair() {
        assertEquals(TRUE, PAIR(TRUE)(FALSE)(OR))
    }

    @Test
    fun fst() {
        val pair = PAIR(TRUE)(FALSE)
        assertEquals(TRUE, FST(pair))
    }

    @Test
    fun snd() {
        val pair = PAIR(TRUE)(FALSE)
        assertEquals(FALSE, SND(pair))
    }

    @Test
    fun phi() {
        val phi = PHI(PAIR(ZERO)(ZERO))
        assertEquals(ZERO, FST(phi)) // ZERO
        assertEquals(FALSE, SND(phi)(NOT)(TRUE)) // ONCE
    }
}
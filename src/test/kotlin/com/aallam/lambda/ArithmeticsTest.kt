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

    @Test
    fun add() {
        assertEquals(TRUE, ADD(ONCE)(ONCE)(NOT)(TRUE)) // TWICE
        assertEquals(FALSE, ADD(TWICE)(THRICE)(NOT)(TRUE)) // FIVEFOLD
    }

    @Test
    fun mult() {
        assertEquals(TRUE, MULT(TWICE)(THRICE)(NOT)(TRUE)) // SIXFOLD
        assertEquals(FALSE, MULT(ONCE)(ONCE)(NOT)(TRUE)) // ONCE
        assertEquals(TRUE, MULT(ONCE)(ZERO)(NOT)(TRUE)) // ZERO
    }

    @Test
    fun pow() {
        assertEquals(TRUE, POW(TWICE)(THRICE)(NOT)(TRUE)) // EIGHTFOLD
        assertEquals(TRUE, POW(ZERO)(ONCE)(NOT)(TRUE)) // ZERO
        assertEquals(FALSE, POW(ONCE)(THRICE)(NOT)(TRUE)) // ONCE
    }

    @Test
    fun iszero() {
        assertEquals(TRUE, Is0(ZERO))
        assertEquals(FALSE, Is0(ONCE))
        assertEquals(FALSE, Is0(FOURFOLD))
    }

    @Test
    fun pred() {
        assertEquals(TRUE, PRED(ONCE)(NOT)(TRUE))
        assertEquals(FALSE, PRED(TWICE)(NOT)(TRUE))
    }

    @Test
    fun sub() {
        assertEquals(ZERO, SUB(ONCE)(ONCE))
        assertEquals(FALSE, SUB(TWICE)(ONCE)(NOT)(TRUE))
    }

    @Test
    fun leq() {
        assertEquals(TRUE, LEQ(ONCE)(ONCE))
        assertEquals(TRUE, LEQ(ONCE)(TWICE))
        assertEquals(FALSE, LEQ(TWICE)(ONCE))
    }

    @Test
    fun eq() {
        assertEquals(TRUE, EQ(ONCE)(ONCE))
        assertEquals(FALSE, EQ(ONCE)(TWICE))
    }

    @Test
    fun gt() {
        assertEquals(FALSE, GT(ONCE)(ONCE))
        assertEquals(FALSE, GT(ONCE)(TWICE))
        assertEquals(TRUE, GT(TWICE)(ONCE))
    }
}
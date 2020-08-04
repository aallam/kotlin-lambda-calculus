package com.aallam.lambda

import kotlin.test.Test
import kotlin.test.assertEquals

class EncodingsTest {

    @Test
    fun not() {
        assertEquals(FALSE, NOT(TRUE))
        assertEquals(TRUE, NOT(FALSE))
    }

    @Test
    fun and() {
        assertEquals(TRUE, AND(TRUE)(TRUE))
        assertEquals(FALSE, AND(TRUE)(FALSE))
        assertEquals(FALSE, AND(FALSE)(TRUE))
        assertEquals(FALSE, AND(FALSE)(FALSE))
    }

    @Test
    fun or() {
        assertEquals(TRUE, OR(TRUE)(TRUE))
        assertEquals(TRUE, OR(TRUE)(FALSE))
        assertEquals(TRUE, OR(FALSE)(TRUE))
        assertEquals(FALSE, OR(FALSE)(FALSE))
    }

    @Test
    fun beq() {
        assertEquals(TRUE, BEQ(TRUE)(TRUE))
        assertEquals(FALSE, BEQ(TRUE)(FALSE))
        assertEquals(FALSE, BEQ(FALSE)(TRUE))
        assertEquals(TRUE, BEQ(FALSE)(FALSE))
    }
}

@file:Suppress("UNCHECKED_CAST")

package com.aallam.lambda

import kotlin.test.Test
import kotlin.test.assertEquals

class CombinatorsTest {

    @Test
    fun identity_I() {
        assertEquals(I, I(I))
    }

    @Test
    fun mockingbird_M() {
        assertEquals(I, M(I))
    }

    @Test
    fun kestrel_K() {
        assertEquals(I, K(I)(M))
    }

    @Test
    fun kite_KI() {
        assertEquals(M, KI(I)(M))
    }

    @Test
    fun cardinal_C() {
        assertEquals(M, C(K)(I)(M))
    }

    @Test
    fun bluebird_B() {
        assertEquals(TRUE, B(NOT)(NOT)(TRUE))
    }

    @Test
    fun thrush_Th() {
        assertEquals(TRUE, Th(FALSE)(NOT))
    }

    @Test
    fun vireo_V() {
        assertEquals(I, V(I)(M)(K))
    }

    @Test
    fun blackbird_B1() {
        assertEquals(TRUE, B1(I)(K)(TRUE)(FALSE))
    }
}

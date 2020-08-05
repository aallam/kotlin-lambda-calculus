@file:Suppress("PublicApiImplicitType", "ObjectPropertyName")

package com.aallam.lambda

// Aka. Church Pairs

/**
 * λ-Calculus: λabf.fab
 * Use: pair two arguments
 */
val PAIR = V

/**
 * λ-Calculus: λp.p(K)
 * Use: extract first of pair
 */
val FST = λ { p -> p(K) }

/**
 * λ-Calculus: λp.p(KI)
 * Use: extract second of pair
 */
val SND = λ { p -> p(KI) }

/**
 * Sym: Φ
 * λ-Calculus: λp.PAIR (SND p) (SUCC (SND p)
 * Use: copy 2nd to 1st, inc 2nd
 */
val Φ = λ { p -> PAIR(SND(p))(SUCC(SND(p))) }

/**
 * λ-Calculus: λcp.PAIR c (SND p)
 * Use: set first, immutably
 */
val SET1ST = λ { c -> λ { p -> PAIR(c)(SND(p)) } }

/**
 * λ-Calculus: λcp.PAIR (FST p) c
 * Use: set second, immutably
 */
val SET2ND = λ { c -> λ { p -> PAIR(FST(p))(c) } }
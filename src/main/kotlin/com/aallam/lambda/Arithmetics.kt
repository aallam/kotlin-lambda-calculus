@file:Suppress("PublicApiImplicitType")

package com.aallam.lambda

// Aka. Church arithmetic

/**
 * λ-Calculus: λnfa.f(nfa)
 * Use: successor of n
 */
val SUCC = λ { n -> λ { f -> λ { a -> f(n(f)(a)) } } }

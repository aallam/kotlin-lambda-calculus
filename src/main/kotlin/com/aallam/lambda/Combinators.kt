@file:Suppress("UNUSED_ANONYMOUS_PARAMETER")

package com.aallam.lambda

/**
 * Sym. Bird: I/Idiot
 * λ-Calculus: λa.a
 * Use: identity
 */
val I = λ { a -> a }

/**
 * Sym. Bird: M/Mockingbird
 * λ-Calculus: λf.ff
 * Use: self-application
 */
val M = λ { a -> a(a) }

/**
 * Sym. Bird: K/Kestrel
 * λ-Calculus: λab.a
 * Use: first, const
 */
val K = λ { a -> λ { b -> a } }

/**
 * Sym. Bird: K/Kite
 * λ-Calculus: λab.b
 * Use: second
 */
val KI = λ { a -> λ { b -> b } }

/**
 * Sym. Bird: C/Cardinal
 * λ-Calculus: λfab.fba
 * Use: reverse arguments
 */
val C = λ { f -> λ { a -> λ { b -> f(b)(a) } } }

/**
 * Sym. Bird: B/Bluebirds
 * λ-Calculus: λfga.f(ga)
 * Use: 1° <- 1° composition
 */
val B = λ { f -> λ { g -> λ { a -> f(g(a)) } } }

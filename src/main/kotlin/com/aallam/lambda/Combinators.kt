@file:Suppress("UNUSED_ANONYMOUS_PARAMETER")

package com.aallam.lambda

/**
 * Sym. Bird: I/Idiot
 * λ-Calculus: λa.a
 * Use: identity
 */
val I = λ { a -> a }

/**
 * Sym. Bird: M/Mockingbird (ω)
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
 * λ-Calculus: λab.b or KI or CK
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
 * Use: 1°<-1° composition
 */
val B = λ { f -> λ { g -> λ { a -> f(g(a)) } } }

/**
 * Sym. Bird: Th/Thrush
 * λ-Calculus: λaf.fa or CI
 * Use: hold an argument
 */
val Th = λ { f -> λ { a -> a(f) } }

/**
 * Sym. Bird: V/Vireo
 * λ-Calculus: λabf.fab of BCTh or BC(CI)
 * Use: hold a pair of arguments
 */
val V = λ { a -> λ { b -> λ { f -> f(a)(b) } } }

/**
 * Sym. Bird: B1/Blackbird
 * λ-Calculus: λfgab.f(gab) or BBB
 * Use: 1°<-2° composition
 */
val B1 = λ { f -> λ { g -> λ { a -> λ { b -> f(g(a)(b)) } } } }

/**
 * Sym. Bird: S/Starling
 * λ-Calculus: λabc.ac(bc)
 * Use: Substitution or replication
 */
val S = λ { a -> λ { b -> λ { c -> a(c)(b(c)) } } }

/**
 * Sym. Bird: Y/Why Bird (aka Sage Bird)
 * λ-Calculus: λf.M(𝜆x.f(Mx))
 * Use: A fixed-point combinator
 */
val Y = λ { f -> M(λ { x -> f(M(x)) }) }

/**
 * Sym. Bird: Z/
 * λ-Calculus: λf.M(𝜆x.f(𝜆v.Mxv))
 * Use: A fixed-point combinator (strict)
 */
val Z = λ { f -> M(λ { x -> f(λ { v -> M(x)(v) }) }) }
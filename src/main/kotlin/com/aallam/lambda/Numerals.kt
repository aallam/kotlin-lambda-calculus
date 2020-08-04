@file:Suppress("PublicApiImplicitType")

package com.aallam.lambda

// Aka. Church Numerals

/**
 * Encoding of 1
 * λ-Calculus: λfa.a == FALSE (== KI)
 * Use: apply f no times to a
 */
val ZERO = KI // OR: λ { f -> λ { a -> a } }

/**
 * Encoding of 1
 * λ-Calculus: λfa.fa == I* (Identity-once-removed)
 * Use: apply f once to a
 */
val ONCE = SUCC(ZERO) // OR: λ { f -> λ { a -> f(a) } }

/**
 * Encoding of 2
 * λ-Calculus: λfa.f(f(a))
 * Use: apply 2-fold f to a
 */
val TWICE = SUCC(ONCE) // OR: λ { f -> λ { a -> f(f(a)) } }

/**
 * Encoding of 3
 * λ-Calculus: λfa.f(f(f(a)))
 * Use: apply 3-fold f to a
 */
val THRICE = SUCC(TWICE) // OR:  λ { f -> λ { a -> f(f(f(a))) } }

/**
 * Encoding of 4
 * λ-Calculus: λfa.f(f(f(f(a))))
 * Use: apply 4-fold f to a
 */
val FOURFOLD = SUCC(THRICE)

/**
 * Encoding of 5
 * λ-Calculus: λfa.f(f(f(f(f(a)))))
 * Use: apply 5-fold f to a
 */
val FIVEFOLD = SUCC(FOURFOLD)

/**
 * Encoding of 10
 * λ-Calculus: λfa.f(f(f(f(f(f(f(f(f(f(a))))))))))
 * Use: apply 10-fold f to a
 */
val TENFOLD = FIVEFOLD(ADD)(FIVEFOLD)

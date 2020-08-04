package com.aallam.lambda

/**
 * Encoding of 1
 */
val ONCE = λ { f -> λ { a -> f(a) } }

/**
 * Encoding of 2
 */
val TWICE = λ { f -> λ { a -> f(f(a)) } }

/**
 * Encoding of 2
 */
val THRICE = λ { f -> λ { a -> f(f(f(a))) } }
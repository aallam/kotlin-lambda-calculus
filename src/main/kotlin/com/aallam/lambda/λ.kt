@file:Suppress("FunctionName", "ClassName", "NonAsciiCharacters")

package com.aallam.lambda

/**
 * Lambda definition.
 */
interface λ {
    infix operator fun invoke(value: λ): λ
}

/**
 * Create a new lambda instance.
 */
fun λ(lambda: (λ) -> λ) = object : λ {
    override fun invoke(value: λ): λ {
        return lambda(value)
    }
}

@file:Suppress("PublicApiImplicitType")

package com.aallam.lambda

/**
 * Encoding of true.
 * λ-Calculus: λab.a == K
 */
val TRUE = K

/**
 * Encoding of false.
 * λ-Calculus: λab.b == KI == CK
 */
val FALSE = KI

/**
 * Negation.
 * λ-Calculus: λp.pFT or C
 */
val NOT = λ { p -> p(FALSE)(TRUE) } // not using Cardinal because it create a "new" TRUE/FALSE objects.

/**
 * Conjunction.
 * λ-Calculus: λpq.pqF or λpq.pqp
 */
val AND = λ { p -> λ { q -> p(q)(p) } }

/**
 * Disjunction.
 * λ-Calculus: λpq.pTq or λpq.ppq == M* (Mockingbird-once-removed)
 */
val OR = λ { p -> λ { q -> p(p)(q) } }

/**
 * Equality.
 * λ-Calculus: λpq.p(NOT(q))
 */
val BEQ = λ { p -> λ { q -> p(q)(NOT(q)) } }

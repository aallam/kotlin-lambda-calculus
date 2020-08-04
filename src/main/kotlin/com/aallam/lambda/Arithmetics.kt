@file:Suppress("PublicApiImplicitType")

package com.aallam.lambda

// Aka. Church arithmetic

/**
 * λ-Calculus: λnfa.f(nfa) or λnf.Bf(nf)
 * Use: successor of n
 */
val SUCC = λ { n -> λ { f -> λ { a -> f(n(f)(a)) } } }

/**
 * λ-Calculus: λn.FST(n Φ (PAIR N0 N0))
 *          or λn.n (𝜆g.IS0 (g N1) I (B SUCC g)) (K N0) N0
 */
val PRED = λ { n -> FST(n(PHI)(PAIR(ZERO)(ZERO))) }

/**
 * λ-Calculus: λnfk.B(nf)(kf) or λnk.n SUCC k
 * Use: addition of n and k
 */
val ADD = λ { n -> λ { k -> n(SUCC)(k) } }

/**
 * λ-Calculus: λnfk.n(kf) or B
 * Use: multiplication of n and k
 */
val MULT = B // OR: λ { n -> λ { k -> λ { f -> n(k(f)) } } }

/**
 * λ-Calculus:  λnk.kn or Th
 * Use: raise n to the power of k
 */
val POW = Th

/**
 * λ-Calculus: λnk.k PRED n
 * Use: subtract k from n
 */
val SUB = λ { n -> λ { k -> k(PRED)(n) } }

// Boolean Ops

/**
 * λ-Calculus:  λn.(KF)T
 * Use: test if n = ZERO
 */
val Is0 = λ { n -> n(K(FALSE))(TRUE) }

/**
 * λ-Calculus: λnk.Is0(SUB nk)
 * Use: test if n <=k
 */
val LEQ = λ { n -> λ { k -> Is0(SUB(n)(k)) } }

/**
 * λ-Calculus: λnk.AND (LEQ n k) (LEQ k n)
 * Use: test if n = k
 */
val EQ = λ { n -> λ { k -> AND(LEQ(n)(k))(LEQ(k)(n)) } }

/**
 * λ-Calculus: λnk.B1 NOT LEQ
 * Use: test if n > k
 */
val GT = λ { n -> λ { k -> B1(NOT)(LEQ)(n)(k) } }
package Program_13 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[Int], T_A[Char, Byte]]
case class CC_B(a: T_A[CC_A, CC_A], b: T_B[Boolean], c: CC_A) extends T_A[T_B[Int], T_A[Char, Byte]]
case class CC_C[D, E](a: (CC_B,CC_B), b: T_A[E, E], c: CC_B) extends T_A[CC_A, D]
case class CC_D[F](a: CC_C[F, F], b: T_B[F]) extends T_B[F]
case class CC_E[G]() extends T_B[G]
case class CC_F[H, I]() extends T_B[H]

val v_a: T_A[CC_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), _, _) => 0 
}
}
// This is not matched: (CC_C (CC_B Boolean Boolean Boolean Boolean)
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (CC_A (T_A Boolean Boolean)) (CC_B Boolean Boolean Boolean Boolean)))
// This is not matched: (CC_B T_A)
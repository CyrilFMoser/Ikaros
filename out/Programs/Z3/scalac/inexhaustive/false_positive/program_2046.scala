package Program_30 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D]() extends T_A[C]
case class CC_B(a: T_A[Int], b: T_A[(Char,Boolean)], c: T_B[Char]) extends T_A[T_B[Boolean]]
case class CC_C[E](a: E, b: T_A[E], c: CC_B) extends T_A[T_A[CC_B]]
case class CC_D[F](a: (CC_B,CC_B), b: CC_A[F, F]) extends T_B[F]
case class CC_E[G, H]() extends T_B[G]
case class CC_F[I]() extends T_B[I]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, CC_F()) => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
}
}
// This is not matched: (CC_B (CC_A Int (T_B (T_A Boolean)) (T_A Int))
//      Wildcard
//      Wildcard
//      (T_A (T_B Boolean)))
// This is not matched: (CC_C Wildcard (CC_C Wildcard Wildcard T_A) T_A)
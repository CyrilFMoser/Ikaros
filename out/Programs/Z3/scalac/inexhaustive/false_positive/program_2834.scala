package Program_30 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: C) extends T_A[C, D]
case class CC_B[F](a: F, b: CC_A[F, F, F]) extends T_A[T_A[F, F], F]
case class CC_C[G](a: G, b: T_A[G, Boolean]) extends T_A[T_A[G, G], G]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A Boolean
//      Int
//      (CC_A Boolean Boolean Boolean Boolean Boolean)
//      Wildcard
//      (T_A Int Boolean))
// This is not matched: (CC_E Wildcard (CC_F T_B) Wildcard T_B)
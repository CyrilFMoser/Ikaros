package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[D, D]) extends T_A[D, C]
case class CC_B[F](a: CC_A[F, F, F]) extends T_A[F, T_A[Boolean, Boolean]]
case class CC_C[G, H]() extends T_A[G, T_A[Boolean, Boolean]]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Boolean Wildcard (T_A Boolean Boolean))
// This is not matched: (CC_A (T_A Boolean) Wildcard (T_A (T_A Boolean)))
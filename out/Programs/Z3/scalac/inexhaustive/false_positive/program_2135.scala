package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Boolean, b: T_A[C]) extends T_A[Boolean]
case class CC_B[D]() extends T_B[D]
case class CC_C[E, F](a: F, b: CC_A[E], c: CC_A[F]) extends T_B[E]
case class CC_D[G]() extends T_B[G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Boolean))
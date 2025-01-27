package Program_30 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D, E](a: Int, b: T_A[E, E], c: T_B) extends T_A[C, D]
case class CC_B[F](a: (T_B,T_B), b: CC_A[F, F, F]) extends T_A[F, T_A[T_B, T_B]]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(_, CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_A Boolean Int T_B Wildcard Wildcard Wildcard (T_A Boolean Int))
// This is not matched: (CC_C Wildcard Wildcard T_A)
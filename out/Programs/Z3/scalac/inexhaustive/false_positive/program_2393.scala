package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D]) extends T_A[T_B[Int, Boolean]]
case class CC_B[E, F](a: T_B[F, E]) extends T_B[T_A[E], E]

val v_a: T_A[T_B[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_B Int Boolean)))
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (Tuple Int Boolean)))
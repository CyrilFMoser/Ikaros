package Program_15 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, Boolean]) extends T_A[C, D]
case class CC_B[F]() extends T_A[F, T_A[Int, F]]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Byte Int Boolean Wildcard (T_A Byte Int))
// This is not matched: (CC_E Wildcard T_B)
package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_C(a: Char) extends T_A[T_B[Int]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_E (Tuple Wildcard Wildcard) T_B)
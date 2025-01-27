package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: E) extends T_A[E, T_A[E, E]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A (CC_C Wildcard Wildcard T_A) Wildcard T_A)
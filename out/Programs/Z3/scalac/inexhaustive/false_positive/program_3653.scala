package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[T_A[C, C], C]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_E Wildcard Wildcard T_B)
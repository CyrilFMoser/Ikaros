package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B[D]() extends T_A[D, Boolean]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)
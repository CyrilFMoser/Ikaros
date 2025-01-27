package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: C, b: T_A[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)
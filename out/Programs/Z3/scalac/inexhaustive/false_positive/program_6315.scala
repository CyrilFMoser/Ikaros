package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: Char, b: T_A[T_B, Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
}
}
// This is not matched: (CC_C Wildcard (T_A (T_A Byte)))
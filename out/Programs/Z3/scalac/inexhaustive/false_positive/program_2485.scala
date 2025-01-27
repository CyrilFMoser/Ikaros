package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, Boolean]) extends T_A[C, T_A[C, C]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_B Char Int)))
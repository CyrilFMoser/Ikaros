package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[(Byte,Boolean), (Byte,Boolean)]) extends T_A[C, T_A[Char, Char]]

val v_a: T_A[Boolean, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_B)
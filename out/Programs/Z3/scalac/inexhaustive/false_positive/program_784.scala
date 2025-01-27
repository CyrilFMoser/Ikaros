package Program_31 

object Test {
sealed trait T_B[A, B]
case class CC_C[C](a: C, b: T_B[C, C]) extends T_B[C, T_B[C, C]]

val v_a: T_B[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_C('x', _) => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard Wildcard (T_A Char))
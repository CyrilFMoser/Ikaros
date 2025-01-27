package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[C, D]
case class CC_A(a: Char, b: T_B[Byte, Char]) extends T_A
case class CC_C[E]() extends T_B[CC_A, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A (Tuple Byte Char) (Tuple Char Byte)))
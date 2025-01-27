package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (Char,Boolean)) extends T_A[C, D]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_B (CC_E (T_A T_B) T_B T_B T_B) (T_A (CC_E (T_A T_B) T_B T_B T_B)))
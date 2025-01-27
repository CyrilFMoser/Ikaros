package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[C, T_A[Byte, Boolean]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B (CC_D T_B T_B T_B T_B) (T_A (CC_D T_B T_B T_B T_B)))
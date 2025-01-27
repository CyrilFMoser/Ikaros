package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[Char]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B (Tuple Byte T_B) T_B (T_A (Tuple Byte T_B)))
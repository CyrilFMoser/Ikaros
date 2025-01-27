package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: C) extends T_A[C, D]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B (T_A Byte) (T_A (T_A Byte)))
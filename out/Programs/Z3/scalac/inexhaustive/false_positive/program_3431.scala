package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Char) extends T_A[C, D]

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A Char (T_A Int Byte) (T_A Char (T_A Int Byte)))
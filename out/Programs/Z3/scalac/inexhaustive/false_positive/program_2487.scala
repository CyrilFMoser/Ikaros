package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Char) extends T_A[C, D]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_B Char Int)))
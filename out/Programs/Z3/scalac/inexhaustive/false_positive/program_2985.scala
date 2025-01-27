package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Byte, T_A[Int, Char]]
case class CC_B[D, C](a: Char) extends T_A[C, D]

val v_a: CC_B[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)
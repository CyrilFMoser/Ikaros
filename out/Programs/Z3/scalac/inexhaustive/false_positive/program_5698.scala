package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: C) extends T_A[C, D]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_A)
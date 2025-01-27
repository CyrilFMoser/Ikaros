package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: (Byte,Char)) extends T_A[C, D]

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_A)
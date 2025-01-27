package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Char)) extends T_A[C, T_A[Byte, Char]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_C Byte Wildcard Wildcard (T_A Byte))
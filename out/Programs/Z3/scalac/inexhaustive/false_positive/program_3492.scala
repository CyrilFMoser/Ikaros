package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,Char), b: T_A[C, C]) extends T_A[C, T_A[C, Char]]

val v_a: T_A[Int, T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,'x'), _) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)
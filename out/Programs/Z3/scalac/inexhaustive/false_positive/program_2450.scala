package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Boolean), b: T_A[C, C]) extends T_A[Int, C]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(('x',_), _) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_A)
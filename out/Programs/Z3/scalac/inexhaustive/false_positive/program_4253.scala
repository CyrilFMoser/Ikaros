package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: T_A[Byte, Char]) extends T_A[T_A[Boolean, Int], T_A[Byte, Char]]

val v_a: T_A[T_A[Boolean, Int], T_A[Byte, Char]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)
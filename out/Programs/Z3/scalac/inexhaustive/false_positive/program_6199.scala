package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Char, b: T_A[Byte, Int]) extends T_A[T_B[Byte, Int], T_A[Boolean, Char]]

val v_a: T_A[T_B[Byte, Int], T_A[Boolean, Char]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_D Int Wildcard (T_B Int))
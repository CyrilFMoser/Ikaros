package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[Char, Int]]

val v_a: T_A[Byte, T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_A Byte Int Boolean Wildcard Wildcard Wildcard (T_A Byte Int))
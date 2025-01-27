package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: D, b: T_A[D, D]) extends T_A[D, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_C Wildcard Wildcard T_A) (Tuple Wildcard Byte)) Wildcard T_A)
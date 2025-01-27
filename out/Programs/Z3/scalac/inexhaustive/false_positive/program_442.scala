package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C]) extends T_A[C, T_A[Boolean, Byte]]

val v_a: T_A[Boolean, T_A[Boolean, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_A Wildcard (CC_C Wildcard Int Wildcard T_A) T_A) T_A)
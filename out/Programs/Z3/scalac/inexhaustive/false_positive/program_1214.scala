package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: T_A[Boolean, Char]) extends T_A[T_A[Int, Byte], T_A[Byte, Boolean]]

val v_a: T_A[T_A[Int, Byte], T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_E Wildcard (T_B (T_B (CC_B Boolean Boolean Boolean Boolean))))
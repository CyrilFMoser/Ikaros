package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E, F]() extends T_A[E, F]
case class CC_C(a: Byte, b: Byte, c: T_A[Int, T_B]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A()) => 0 
}
}
// This is not matched: (CC_A Boolean Char Boolean Wildcard Wildcard (T_A Char Boolean))
package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, C], b: C, c: T_A[Boolean, Boolean]) extends T_A[Boolean, C]
case class CC_B[D]() extends T_A[Boolean, D]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_A T_A)
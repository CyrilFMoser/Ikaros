package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[Byte, C]) extends T_A[Byte, C]
case class CC_B[D]() extends T_A[Byte, D]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A (CC_C Boolean Boolean Boolean) (T_A (CC_C Boolean Boolean Boolean)))
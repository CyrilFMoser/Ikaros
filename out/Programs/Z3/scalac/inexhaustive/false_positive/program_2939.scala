package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C]) extends T_A[(Byte,T_B), C]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: T_A[(Byte,T_B), CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
}
}
// This is not matched: (CC_A (CC_C Boolean Boolean) (T_A (CC_C Boolean Boolean)))
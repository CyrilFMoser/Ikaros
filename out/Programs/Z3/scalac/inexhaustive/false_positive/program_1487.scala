package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_B, C]) extends T_A[C, (T_B,T_B)]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _) => 0 
}
}
// This is not matched: (CC_C Byte (T_B Byte))
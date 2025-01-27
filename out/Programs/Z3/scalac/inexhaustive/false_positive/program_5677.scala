package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, T_B]
case class CC_C() extends T_A[T_B, T_B]
case class CC_D(a: T_A[T_B, T_B]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
}
}
// This is not matched: (CC_A Byte (T_A Byte Byte) (T_A Byte (T_A Byte Byte)))
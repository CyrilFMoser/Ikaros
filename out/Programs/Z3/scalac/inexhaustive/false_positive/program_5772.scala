package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[Byte, T_B], T_B]
case class CC_B(a: T_A[T_B, CC_A], b: T_B) extends T_B
case class CC_D() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D()) => 0 
}
}
// This is not matched: (CC_A (CC_A (CC_B T_A) T_A) T_A)
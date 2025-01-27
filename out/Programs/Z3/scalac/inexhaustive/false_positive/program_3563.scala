package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B(a: Byte) extends T_B[T_A[Byte, Boolean]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A Boolean (T_A Boolean))
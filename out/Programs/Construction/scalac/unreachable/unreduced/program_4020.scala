package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: T_A[Boolean], c: T_B) extends T_A[Boolean]
case class CC_B() extends T_A[T_A[(T_B,CC_A)]]
case class CC_C() extends T_A[T_A[(T_B,CC_A)]]
case class CC_D(a: CC_B, b: T_A[T_A[CC_C]]) extends T_B
case class CC_E(a: Boolean, b: T_A[Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), _) => 0 
  case CC_E(true, _) => 1 
  case CC_E(false, _) => 2 
}
}
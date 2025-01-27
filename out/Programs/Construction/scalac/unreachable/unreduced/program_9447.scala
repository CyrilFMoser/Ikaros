package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int) extends T_A
case class CC_B(a: Boolean, b: T_B[T_B[T_A]]) extends T_A
case class CC_C(a: CC_A, b: T_B[(T_A,CC_B)]) extends T_B[(T_A,CC_B)]
case class CC_D(a: Byte) extends T_B[(T_A,CC_B)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
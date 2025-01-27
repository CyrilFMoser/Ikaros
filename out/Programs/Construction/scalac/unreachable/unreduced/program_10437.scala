package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A) extends T_B[T_B[(CC_A,CC_A)]]
case class CC_C(a: Int, b: T_A, c: Int) extends T_B[(T_B[CC_B],Byte)]
case class CC_D(a: T_B[(CC_C,CC_B)]) extends T_B[T_B[(CC_A,CC_A)]]

val v_a: T_B[T_B[(CC_A,CC_A)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_D(_) => 1 
}
}
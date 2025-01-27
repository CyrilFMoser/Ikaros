package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C() extends T_B[(T_A,CC_B)]
case class CC_D(a: T_B[T_A]) extends T_B[(T_A,CC_B)]

val v_a: T_B[(T_A,CC_B)] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
}
}
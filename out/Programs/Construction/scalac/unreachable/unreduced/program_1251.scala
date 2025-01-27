package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[(T_A,Char)]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C() extends T_B[T_B[(CC_A,CC_B)]]
case class CC_D(a: Int, b: T_B[T_B[CC_B]], c: CC_C) extends T_B[T_B[(CC_A,CC_B)]]

val v_a: T_B[T_B[(CC_A,CC_B)]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}
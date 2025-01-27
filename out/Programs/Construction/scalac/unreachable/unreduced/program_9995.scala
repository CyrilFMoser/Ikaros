package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[Char]], b: Byte, c: T_B[(T_A,Char)]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[(T_A,CC_A)], b: T_B[CC_A]) extends T_B[(T_A,CC_A)]
case class CC_D(a: Byte) extends T_B[(T_A,CC_A)]

val v_a: T_B[(T_A,CC_A)] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_) => 1 
}
}
package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],(T_A,Byte)), b: (T_B[T_A],T_A), c: T_B[(T_A,T_A)]) extends T_A
case class CC_B(a: Boolean) extends T_A
case class CC_C() extends T_B[(T_B[Char],T_A)]
case class CC_D() extends T_B[(T_B[Char],T_A)]
case class CC_E(a: CC_C, b: T_B[(CC_A,CC_D)], c: Char) extends T_B[(T_B[Char],T_A)]

val v_a: T_B[(T_B[Char],T_A)] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E(_, _, _) => 2 
}
}
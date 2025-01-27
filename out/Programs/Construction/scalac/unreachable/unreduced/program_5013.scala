package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: CC_A, c: Byte) extends T_A
case class CC_C() extends T_B[(CC_A,T_A)]
case class CC_D(a: T_A, b: T_B[CC_A], c: CC_A) extends T_B[(CC_A,T_A)]
case class CC_E(a: CC_D, b: CC_C, c: T_B[CC_B]) extends T_B[(Char,CC_A)]

val v_a: T_B[(CC_A,T_A)] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, CC_A()) => 1 
}
}
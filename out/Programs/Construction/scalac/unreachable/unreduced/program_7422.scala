package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (Char,((Int,Char),(Int,Byte))), b: CC_A, c: T_B[Byte]) extends T_A
case class CC_C() extends T_B[(Char,CC_A)]
case class CC_D(a: CC_C, b: T_A, c: Boolean) extends T_B[(Char,CC_A)]
case class CC_E(a: T_B[CC_B], b: CC_D) extends T_B[(Char,CC_A)]

val v_a: T_B[(Char,CC_A)] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E(_, CC_D(CC_C(), CC_A(), _)) => 1 
  case CC_E(_, CC_D(CC_C(), CC_B(_, _, _), _)) => 2 
}
}
// This is not matched: CC_D(CC_C(), _, _)
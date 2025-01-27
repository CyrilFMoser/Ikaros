package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[CC_A]
case class CC_D(a: T_B[CC_C], b: Int, c: CC_C) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
  case CC_E() => 2 
}
}
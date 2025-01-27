package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_B) extends T_A
case class CC_B() extends T_B
case class CC_D() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D()) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)
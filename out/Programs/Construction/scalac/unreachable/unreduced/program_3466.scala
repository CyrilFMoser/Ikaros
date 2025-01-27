package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: T_B[CC_B], c: Boolean) extends T_A
case class CC_D() extends T_B[(CC_A,(Int,CC_B))]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_A(_, CC_C(_, _, _)) => 1 
}
}
// This is not matched: CC_A(_, CC_A(_, _))
package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: Boolean, b: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A Int Byte Boolean (T_A Byte Int))
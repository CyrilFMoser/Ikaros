package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: Byte, b: T_A) extends T_A
case class CC_C() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A (CC_A Boolean Boolean) (T_A (CC_A Boolean Boolean)))
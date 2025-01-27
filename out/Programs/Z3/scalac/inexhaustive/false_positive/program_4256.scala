package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_D() extends T_B
case class CC_F() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_F()) => 0 
}
}
// This is not matched: (CC_A (T_A Byte) (CC_B Wildcard (T_A (T_A Byte))) Wildcard (T_A (T_A Byte)))
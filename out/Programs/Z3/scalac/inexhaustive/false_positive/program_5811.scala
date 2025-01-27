package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_D() extends T_B
case class CC_E(a: T_A, b: T_B) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(_, CC_D()) => 0 
}
}
// This is not matched: Pattern match is empty without constants
package Program_30 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_C(a: CC_A) extends T_B
case class CC_E() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_E())) => 0 
}
}
// This is not matched: CC_A(CC_A(_))
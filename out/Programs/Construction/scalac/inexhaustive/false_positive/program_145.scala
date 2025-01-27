package Program_27 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_C(a: ((CC_A,T_B),T_B), b: T_A) extends T_B
case class CC_E() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((_,CC_E()), _) => 0 
}
}
// This is not matched: CC_B((_,CC_B(_)))
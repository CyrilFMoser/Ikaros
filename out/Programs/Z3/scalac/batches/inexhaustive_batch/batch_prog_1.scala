package Program_1 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B(a: (CC_A,CC_A)) extends T_A
case class CC_C(a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_),CC_A(_))) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)
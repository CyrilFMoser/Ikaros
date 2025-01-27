package Program_10 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_B() extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_B, b: CC_C, c: (T_B,CC_B)) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, _, (CC_C(),_)) => 0 
}
}
// This is not matched: (CC_B Wildcard Byte T_A)
package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: Char, c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_A Wildcard Boolean T_A) (CC_B T_A)) Wildcard T_A)
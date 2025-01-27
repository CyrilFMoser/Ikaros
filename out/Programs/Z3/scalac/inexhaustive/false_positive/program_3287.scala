package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: ((Char,Int),T_A)) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_))) => 0 
}
}
// This is not matched: (CC_A (Tuple (Tuple Char Int) (CC_B (CC_A Wildcard Wildcard T_A) T_A))
//      Wildcard
//      T_A)
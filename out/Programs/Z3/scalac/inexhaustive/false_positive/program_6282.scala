package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,Char)) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),_)) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_B Char (CC_A Wildcard Wildcard T_A) T_A) Char) Wildcard T_A)
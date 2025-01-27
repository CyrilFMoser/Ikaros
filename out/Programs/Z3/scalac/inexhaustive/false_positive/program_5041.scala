package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,(Char,Int))) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((CC_B(),_)) => 0 
}
}
// This is not matched: (CC_E Wildcard T_B)
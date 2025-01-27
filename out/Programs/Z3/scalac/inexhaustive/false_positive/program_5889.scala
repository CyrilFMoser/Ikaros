package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: Char) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A (Tuple Wildcard (CC_A (Tuple Int Wildcard) Wildcard Wildcard T_A))
//      Wildcard
//      Wildcard
//      T_A)
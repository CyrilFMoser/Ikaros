package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: Char) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C Wildcard
//      (CC_A (T_A Char))
//      (CC_C Wildcard (CC_A (T_A Char)) (CC_A (T_A Char)) (T_A Char))
//      (T_A Char))
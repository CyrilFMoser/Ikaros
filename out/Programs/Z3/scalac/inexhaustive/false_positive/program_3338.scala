package Program_8 

object Test {
sealed trait T_A
case class CC_A(a: Char) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
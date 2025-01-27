package Program_30 

object Test {
sealed trait T_B
case class CC_D(a: Char) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
}
}
// This is not matched: (CC_A Char Wildcard Wildcard (T_A Char))
package Program_14 

object Test {
sealed trait T_B
case class CC_C(a: Char) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
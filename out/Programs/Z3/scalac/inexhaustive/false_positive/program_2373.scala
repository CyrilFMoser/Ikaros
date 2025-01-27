package Program_31 

object Test {
sealed trait T_B
case class CC_F(a: Char) extends T_B

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
package Program_15 

object Test {
sealed trait T_A
case class CC_B(a: (Char,T_A)) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
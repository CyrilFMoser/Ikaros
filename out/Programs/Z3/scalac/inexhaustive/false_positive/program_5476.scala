package Program_13 

object Test {
sealed trait T_A
case class CC_B(a: (Int,Char)) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((12,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
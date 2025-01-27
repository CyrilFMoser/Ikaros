package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: (Char,Char)) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A) Wildcard T_A)
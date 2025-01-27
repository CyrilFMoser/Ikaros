package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: (Byte,T_A)) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_A Wildcard (CC_C Char (T_A Char)) (T_A Char)) (T_A Char))
package Program_23 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,Byte)) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_A (T_A Boolean) (T_A Boolean) Wildcard (T_A (T_A Boolean)))
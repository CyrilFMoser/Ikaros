package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: (Byte,T_A)) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_C Boolean Wildcard Wildcard (T_A Boolean))
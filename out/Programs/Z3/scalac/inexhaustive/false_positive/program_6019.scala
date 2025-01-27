package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: (Char,T_A)) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_E (Tuple (CC_D Wildcard Wildcard Wildcard Wildcard T_B)
//             (CC_D Boolean Boolean Boolean Boolean T_B))
//      (Tuple (CC_D Boolean Boolean Boolean Wildcard T_B) Wildcard)
//      T_B)
package Program_12 

object Test {
sealed trait T_B
case class CC_E(a: Byte) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(0) => 0 
}
}
// This is not matched: (CC_E (Tuple (CC_D Wildcard Wildcard Wildcard Wildcard T_B)
//             (CC_D Boolean Boolean Boolean Boolean T_B))
//      (Tuple (CC_D Boolean Boolean Boolean Wildcard T_B) Wildcard)
//      T_B)
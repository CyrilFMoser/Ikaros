package Program_11 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: CC_B, c: T_A) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_E (Tuple (CC_D Wildcard Wildcard Wildcard Wildcard T_B)
//             (CC_D Boolean Boolean Boolean Boolean T_B))
//      (Tuple (CC_D Boolean Boolean Boolean Wildcard T_B) Wildcard)
//      T_B)
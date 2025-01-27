package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_E[G](a: Char) extends T_B[G]

val v_a: CC_E[Char] = null
val v_b: Int = v_a match{
  case CC_E('x') => 0 
}
}
// This is not matched: (CC_A Boolean
//      (CC_A Boolean Wildcard Wildcard T_A)
//      (Tuple Wildcard
//             (CC_B Wildcard
//                   Wildcard
//                   (CC_A Boolean
//                         (CC_A Wildcard Wildcard Wildcard T_A)
//                         (Tuple Boolean Wildcard)
//                         T_A)
//                   T_A))
//      T_A)
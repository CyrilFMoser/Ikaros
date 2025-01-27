package Program_31 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C[B, C](a: T_B[CC_A], b: C) extends T_B[B]
case class CC_D() extends T_B[CC_C[CC_B, CC_A]]

val v_a: CC_C[Byte, CC_D] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), CC_D()) => 0 
}
}
// This is not matched: (CC_C Byte
//      (CC_D T_A)
//      (CC_C (CC_A Wildcard Wildcard)
//            Boolean
//            (CC_C (CC_A Wildcard Wildcard)
//                  Boolean
//                  Wildcard
//                  Boolean
//                  (T_B (CC_A Wildcard Wildcard)))
//            Wildcard
//            (T_B (CC_A Wildcard Wildcard)))
//      Wildcard
//      (T_B Byte))
// This is not matched: (CC_A Wildcard
//      (CC_D Byte Boolean Wildcard (T_B Boolean Byte))
//      Wildcard
//      (T_A (Tuple Boolean Boolean) (T_B Boolean Int)))
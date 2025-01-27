package Program_31 

package Program_3 

object Test {
sealed trait T_A
case class CC_A[A](a: Boolean, b: A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A (CC_A (CC_B Wildcard Wildcard Wildcard T_A) Wildcard T_A)
//      (Tuple (CC_B Wildcard
//                   (CC_B (CC_A (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)
//                               Wildcard
//                               T_A)
//                         (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)
//                         (CC_A Wildcard Wildcard T_A)
//                         T_A)
//                   (CC_A (CC_A (CC_B (CC_A Wildcard Wildcard T_A)
//                                     (CC_A Wildcard Wildcard T_A)
//                                     Wildcard
//                                     T_A)
//                               Wildcard
//                               T_A)
//                         Wildcard
//                         T_A)
//                   T_A)
//             (CC_A (CC_A Wildcard Wildcard T_A) (Tuple Wildcard Wildcard) T_A))
//      T_A)
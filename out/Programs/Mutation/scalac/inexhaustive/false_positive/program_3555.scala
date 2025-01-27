package Program_30 

object Test {
sealed trait T_A
case class CC_B(a: Char) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard T_A)
//      (Tuple (CC_A (CC_B Wildcard T_A)
//                   Wildcard
//                   (CC_C T_A
//                         Wildcard
//                         Wildcard
//                         (CC_C T_A
//                               Wildcard
//                               Wildcard
//                               (CC_C T_A
//                                     Wildcard
//                                     (CC_B Wildcard T_A)
//                                     Wildcard
//                                     (T_B T_A))
//                               (T_B T_A))
//                         (T_B T_A))
//                   T_A)
//             Wildcard)
//      Wildcard
//      T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_C(_, _, _)
// }
//
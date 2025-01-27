package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_A (CC_A (CC_A Wildcard Wildcard (Tuple Wildcard Wildcard) T_A)
//                         Boolean
//                         Wildcard
//                         T_A)
//                   Wildcard
//                   Wildcard
//                   T_A)
//             (CC_A (CC_A Wildcard
//                         Boolean
//                         (Tuple (CC_B Wildcard Wildcard Byte T_A)
//                                (CC_B (Tuple Wildcard Wildcard)
//                                      Wildcard
//                                      Byte
//                                      T_A))
//                         T_A)
//                   Wildcard
//                   Wildcard
//                   T_A))
//      Wildcard
//      Wildcard
//      T_A)
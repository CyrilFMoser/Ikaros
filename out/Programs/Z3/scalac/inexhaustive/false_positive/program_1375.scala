package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[T_B[Byte, Char]]
case class CC_B[E]() extends T_B[T_A[Boolean], ((Boolean,Int),Boolean)]

val v_a: T_B[T_A[Boolean], ((Boolean,Int),Boolean)] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B Boolean (T_B (T_A Boolean) (Tuple (Tuple Boolean Int) Boolean)))
// This is not matched: (CC_E Boolean
//      (CC_E (CC_C (T_A (CC_D (T_B (CC_C (CC_A (T_A (CC_B Boolean
//                                                         Boolean
//                                                         Boolean
//                                                         Boolean
//                                                         Boolean))
//                                              Boolean
//                                              Boolean
//                                              Boolean)
//                                        Boolean))
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean))
//                  Boolean)
//            Boolean
//            Boolean
//            Boolean)
//      (CC_C (CC_E (CC_C (T_A (CC_D (T_B (CC_C (CC_A (T_A (CC_B Boolean
//                                                               Boolean
//                                                               Boolean
//                                                               Boolean
//                                                               (T_A Boolean)))
//                                                    Boolean
//                                                    Boolean
//                                                    Boolean)
//                                              Boolean))
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean))
//                        Boolean)
//                  Boolean
//                  Boolean
//                  Boolean)
//            (T_B (CC_E (CC_C (T_A (CC_D (T_B (CC_C (CC_A (T_A (CC_B Boolean
//                                                                    Boolean
//                                                                    Boolean
//                                                                    Boolean
//                                                                    (T_A Boolean)))
//                                                         Boolean
//                                                         Boolean
//                                                         Boolean)
//                                                   Boolean))
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean))
//                             Boolean)
//                       Boolean
//                       Boolean
//                       Boolean)))
//      (T_B Boolean))
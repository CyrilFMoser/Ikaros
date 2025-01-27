package Program_31 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B], b: T_B[B], c: Char) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, 'x') => 0 
  case CC_A(_, _, _) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_E (CC_B Boolean Boolean)
//      Boolean
//      (CC_E (CC_A (CC_A (T_B (CC_B Boolean (T_A Boolean Boolean))
//                             (CC_A Boolean
//                                   (CC_C Boolean
//                                         Boolean
//                                         Boolean
//                                         Boolean
//                                         Boolean
//                                         Boolean)
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean))
//                        Boolean
//                        Boolean
//                        Boolean
//                        Boolean
//                        Boolean)
//                  (CC_C (CC_B (CC_B (CC_D (T_A Boolean
//                                               (T_B (CC_A Boolean
//                                                          (CC_B Boolean Boolean)
//                                                          Boolean
//                                                          Boolean
//                                                          Boolean
//                                                          Boolean)
//                                                    Boolean))
//                                          Boolean
//                                          Boolean
//                                          Boolean)
//                                    Boolean)
//                              Boolean)
//                        Boolean
//                        Boolean
//                        Boolean
//                        Boolean
//                        Boolean)
//                  Boolean
//                  Boolean
//                  Boolean
//                  Boolean)
//            Boolean
//            Boolean
//            Boolean
//            Boolean)
//      (CC_C (CC_E (CC_A (CC_A (T_B (CC_B Boolean Boolean)
//                                   (CC_A Boolean
//                                         (CC_C Boolean
//                                               Boolean
//                                               (T_A Boolean Boolean)
//                                               Boolean
//                                               Boolean
//                                               Boolean)
//                                         Boolean
//                                         Boolean
//                                         Boolean
//                                         Boolean))
//                              Boolean
//                              Boolean
//                              Boolean
//                              Boolean
//                              Boolean)
//                        (CC_C (CC_B (CC_B (CC_D (T_A Boolean
//                                                     (T_B (CC_A Boolean
//                                                                (CC_B Boolean
//                                                                      (T_A Boolean
//                                                                           Boolean))
//                                                                Boolean
//                                                                Boolean
//                                                                Boolean
//                                                                Boolean)
//                                                          Boolean))
//                                                Boolean
//                                                Boolean
//                                                Boolean)
//                                          Boolean)
//                                    Boolean)
//                              Boolean
//                              Boolean
//                              Boolean
//                              Boolean
//                              Boolean)
//                        Boolean
//                        Boolean
//                        Boolean
//                        Boolean)
//                  Boolean
//                  Boolean
//                  Boolean
//                  Boolean)
//            Boolean
//            Boolean
//            Boolean
//            Wildcard
//            (T_A (CC_E (CC_A (CC_A (T_B (CC_B Boolean Boolean)
//                                        (CC_A Boolean
//                                              (CC_C Boolean
//                                                    Boolean
//                                                    (T_A Boolean Boolean)
//                                                    Boolean
//                                                    Boolean
//                                                    Boolean)
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean))
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean)
//                             (CC_C (CC_B (CC_B (CC_D (T_A Boolean
//                                                          (T_B (CC_A Boolean
//                                                                     (CC_B Boolean
//                                                                           (T_A Boolean
//                                                                                Boolean))
//                                                                     Boolean
//                                                                     Boolean
//                                                                     Boolean
//                                                                     Boolean)
//                                                               Boolean))
//                                                     Boolean
//                                                     Boolean
//                                                     Boolean)
//                                               Boolean)
//                                         Boolean)
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean)
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean)
//                       Boolean
//                       Boolean
//                       Boolean
//                       Boolean)
//                 Boolean))
//      (T_B Boolean (CC_B Boolean Boolean)))
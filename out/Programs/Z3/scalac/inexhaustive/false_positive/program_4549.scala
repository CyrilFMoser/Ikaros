package Program_14 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, Boolean]) extends T_A[C, D]
case class CC_B[F]() extends T_A[F, T_A[Int, F]]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte
//      Int
//      Boolean
//      (CC_A Boolean
//            Boolean
//            Boolean
//            (CC_A Boolean
//                  Boolean
//                  (CC_B Boolean (T_A (T_A Boolean Boolean) Boolean))
//                  (CC_A (CC_B Boolean (T_A Boolean Boolean))
//                        Boolean
//                        (T_A Boolean
//                             (CC_A (CC_A (CC_A (T_A (CC_B Boolean
//                                                          (T_A Boolean Boolean))
//                                                    Boolean)
//                                               Boolean
//                                               Boolean
//                                               Boolean
//                                               Boolean)
//                                         Boolean
//                                         Boolean
//                                         Boolean
//                                         Boolean)
//                                   Boolean
//                                   (T_A Boolean
//                                        (CC_B (CC_A Boolean
//                                                    Boolean
//                                                    (T_A (CC_B Boolean Boolean)
//                                                         Boolean)
//                                                    Boolean
//                                                    Boolean)
//                                              Boolean))
//                                   Boolean
//                                   Boolean))
//                        (CC_A (T_A Boolean
//                                   (CC_A (CC_A (CC_A (T_A (CC_B Boolean Boolean)
//                                                          Boolean)
//                                                     Boolean
//                                                     Boolean
//                                                     Boolean
//                                                     Boolean)
//                                               Boolean
//                                               Boolean
//                                               Boolean
//                                               Boolean)
//                                         Boolean
//                                         (T_A Boolean
//                                              (CC_B (CC_A Boolean
//                                                          Boolean
//                                                          (T_A (CC_B Boolean
//                                                                     (T_A Boolean
//                                                                          Boolean))
//                                                               Boolean)
//                                                          Boolean
//                                                          Boolean)
//                                                    Boolean))
//                                         Boolean
//                                         Boolean))
//                              Boolean
//                              Boolean
//                              (CC_A Boolean
//                                    Boolean
//                                    Boolean
//                                    (CC_A Boolean
//                                          Boolean
//                                          Boolean
//                                          Wildcard
//                                          (T_A Boolean Boolean))
//                                    (T_A Boolean Boolean))
//                              (T_A (T_A Boolean
//                                        (CC_A (CC_A (CC_A (T_A (CC_B Boolean
//                                                                     Boolean)
//                                                               Boolean)
//                                                          Boolean
//                                                          Boolean
//                                                          Boolean
//                                                          Boolean)
//                                                    Boolean
//                                                    Boolean
//                                                    Boolean
//                                                    Boolean)
//                                              Boolean
//                                              (T_A Boolean
//                                                   (CC_B (CC_A Boolean
//                                                               Boolean
//                                                               (T_A (CC_B Boolean
//                                                                          (T_A Boolean
//                                                                               Boolean))
//                                                                    Boolean)
//                                                               Boolean
//                                                               Boolean)
//                                                         Boolean))
//                                              Boolean
//                                              Boolean))
//                                   Boolean))
//                        (T_A (CC_B Boolean (T_A Boolean Boolean)) Boolean))
//                  (T_A Boolean Boolean))
//            (T_A Boolean Boolean))
//      (T_A Byte Int))
// This is not matched: (CC_E Wildcard T_B)
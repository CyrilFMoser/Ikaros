package Program_15 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[H, G, I](a: T_A[H, H], b: T_A[I, I], c: CC_A[I, Int]) extends T_B[H, G]
case class CC_C[J, K](a: T_A[K, K], b: Char, c: CC_A[K, K]) extends T_B[J, K]
case class CC_D[L](a: T_B[L, L], b: T_A[L, Boolean], c: CC_C[Int, L]) extends T_B[L, Char]

val v_a: CC_D[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _, _), CC_A(), CC_C(_, _, _)) => 0 
  case CC_D(CC_C(_, _, _), _, CC_C(_, _, _)) => 1 
  case CC_D(CC_B(_, _, _), _, _) => 2 
}
}
// This is not matched: (CC_D Boolean
//      (CC_B Boolean
//            Boolean
//            (T_A (CC_C (CC_A Boolean Boolean Boolean)
//                       (T_B (T_A (CC_B Boolean
//                                       (T_B (CC_D (CC_D Boolean
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean)
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean)
//                                            (CC_D (CC_A Boolean Boolean Boolean)
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean))
//                                       Boolean
//                                       Boolean
//                                       Boolean
//                                       Boolean
//                                       Boolean)
//                                 Boolean)
//                            (CC_C (CC_D Boolean
//                                        Boolean
//                                        Boolean
//                                        (T_A Boolean Boolean)
//                                        Boolean)
//                                  Boolean
//                                  Boolean
//                                  Boolean
//                                  Boolean
//                                  Boolean))
//                       Boolean
//                       Boolean
//                       Boolean
//                       Boolean)
//                 (CC_D (T_B Boolean
//                            (CC_C (CC_B (CC_D Boolean
//                                              Boolean
//                                              Boolean
//                                              (T_A Boolean Boolean)
//                                              Boolean)
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean)
//                                  Boolean
//                                  Boolean
//                                  Boolean
//                                  Boolean
//                                  Boolean))
//                       Boolean
//                       Boolean
//                       Boolean
//                       Boolean))
//            (CC_A Boolean Boolean (T_A Boolean Boolean))
//            (CC_A (T_A (CC_C (CC_A Boolean Boolean Boolean)
//                             (T_B (T_A (CC_B Boolean
//                                             (T_B (CC_D (CC_D Boolean
//                                                              Boolean
//                                                              Boolean
//                                                              Boolean
//                                                              Boolean)
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean)
//                                                  (CC_D (CC_A Boolean
//                                                              Boolean
//                                                              Boolean)
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean))
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean)
//                                       Boolean)
//                                  (CC_C (CC_D Boolean
//                                              Boolean
//                                              Boolean
//                                              (T_A Boolean Boolean)
//                                              Boolean)
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean))
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean)
//                       (CC_D (T_B Boolean
//                                  (CC_C (CC_B (CC_D Boolean
//                                                    Boolean
//                                                    Boolean
//                                                    Boolean
//                                                    Boolean)
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean)
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean))
//                             (T_A Boolean Boolean)
//                             (T_A Boolean Boolean)
//                             (T_A Boolean Boolean)
//                             (T_A Boolean Boolean)))
//                  (T_A (CC_C (CC_A Boolean Boolean Boolean)
//                             (T_B (T_A (CC_B Boolean
//                                             (T_B (CC_D (CC_D Boolean
//                                                              Boolean
//                                                              Boolean
//                                                              Boolean
//                                                              Boolean)
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean)
//                                                  (CC_D (CC_A Boolean
//                                                              Boolean
//                                                              Boolean)
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean))
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean)
//                                       Boolean)
//                                  (CC_C (CC_D Boolean
//                                              Boolean
//                                              Boolean
//                                              (T_A Boolean Boolean)
//                                              Boolean)
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean))
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean)
//                       (CC_D (T_B Boolean
//                                  (CC_C (CC_B (CC_D Boolean
//                                                    Boolean
//                                                    Boolean
//                                                    (T_A Boolean Boolean)
//                                                    Boolean)
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean)
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean))
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean))
//                  (T_A (T_A (CC_C (CC_A Boolean Boolean Boolean)
//                                  (T_B (T_A (CC_B Boolean
//                                                  (T_B (CC_D (CC_D Boolean
//                                                                   Boolean
//                                                                   Boolean
//                                                                   Boolean
//                                                                   Boolean)
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean)
//                                                       (CC_D (CC_A Boolean
//                                                                   Boolean
//                                                                   Boolean)
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean))
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean)
//                                            Boolean)
//                                       (CC_C (CC_D Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   (T_A Boolean Boolean)
//                                                   Boolean)
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean))
//                                  Boolean
//                                  Boolean
//                                  Boolean
//                                  Boolean)
//                            (CC_D (T_B Boolean
//                                       (CC_C (CC_B (CC_D Boolean
//                                                         Boolean
//                                                         Boolean
//                                                         Boolean
//                                                         Boolean)
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean)
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean))
//                                  (T_A Boolean Boolean)
//                                  (T_A Boolean Boolean)
//                                  (T_A Boolean Boolean)
//                                  (T_A Boolean Boolean)))
//                       (T_A (CC_C (CC_A Boolean Boolean Boolean)
//                                  (T_B (T_A (CC_B Boolean
//                                                  (T_B (CC_D (CC_D Boolean
//                                                                   Boolean
//                                                                   Boolean
//                                                                   Boolean
//                                                                   Boolean)
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean)
//                                                       (CC_D (CC_A Boolean
//                                                                   Boolean
//                                                                   Boolean)
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean))
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean)
//                                            Boolean)
//                                       (CC_C (CC_D Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   (T_A Boolean Boolean)
//                                                   Boolean)
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean))
//                                  Boolean
//                                  Boolean
//                                  Boolean
//                                  Boolean)
//                            (CC_D (T_B Boolean
//                                       (CC_C (CC_B (CC_D Boolean
//                                                         Boolean
//                                                         Boolean
//                                                         (T_A Boolean Boolean)
//                                                         Boolean)
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean)
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean))
//                                  Boolean
//                                  Boolean
//                                  Boolean
//                                  Boolean))))
//            (CC_A (T_A (CC_C (CC_A Boolean Boolean (T_A Boolean Boolean))
//                             (T_B (T_A (CC_B Boolean
//                                             (T_B (CC_D (CC_D Boolean
//                                                              Boolean
//                                                              Boolean
//                                                              (T_A Boolean
//                                                                   Boolean)
//                                                              Boolean)
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean)
//                                                  (CC_D (CC_A Boolean
//                                                              Boolean
//                                                              (T_A Boolean
//                                                                   Boolean))
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean
//                                                        Boolean))
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean)
//                                       Boolean)
//                                  (CC_C (CC_D Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean)
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean))
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean)
//                       (CC_D (T_B Boolean
//                                  (CC_C (CC_B (CC_D Boolean
//                                                    Boolean
//                                                    Boolean
//                                                    (T_A Boolean Boolean)
//                                                    Boolean)
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean)
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean))
//                             (T_A Boolean Boolean)
//                             (T_A Boolean Boolean)
//                             (T_A Boolean Boolean)
//                             (T_A Boolean Boolean)))
//                  Int
//                  (T_A (T_A (CC_C (CC_A Boolean Boolean (T_A Boolean Boolean))
//                                  (T_B (T_A (CC_B Boolean
//                                                  (T_B (CC_D (CC_D Boolean
//                                                                   Boolean
//                                                                   Boolean
//                                                                   (T_A Boolean
//                                                                        Boolean)
//                                                                   Boolean)
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean)
//                                                       (CC_D (CC_A Boolean
//                                                                   Boolean
//                                                                   (T_A Boolean
//                                                                        Boolean))
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean
//                                                             Boolean))
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean)
//                                            Boolean)
//                                       (CC_C (CC_D Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean)
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean))
//                                  Boolean
//                                  Boolean
//                                  Boolean
//                                  Boolean)
//                            (CC_D (T_B Boolean
//                                       (CC_C (CC_B (CC_D Boolean
//                                                         Boolean
//                                                         Boolean
//                                                         (T_A Boolean Boolean)
//                                                         Boolean)
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean
//                                                   Boolean)
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean))
//                                  (T_A Boolean Boolean)
//                                  (T_A Boolean Boolean)
//                                  (T_A Boolean Boolean)
//                                  (T_A Boolean Boolean)))
//                       Int))
//            (T_B Boolean Boolean))
//      Wildcard
//      Wildcard
//      (T_B Boolean Char))
// This is not matched: (CC_B Boolean Wildcard (T_A Byte))
package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B, b: T_A[D, D], c: C) extends T_A[D, C]
case class CC_B[F, E](a: Boolean, b: T_B, c: T_A[F, E]) extends T_A[E, F]
case class CC_C(a: (T_B,T_B), b: CC_A[Byte, T_B], c: CC_B[T_B, T_B]) extends T_B
case class CC_D[G](a: Boolean, b: CC_A[G, CC_C], c: T_A[G, G]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _), CC_B(_, _, _)) => 0 
  case CC_C((CC_D(_, _, _),CC_C(_, _, _)), CC_A(_, _, _), _) => 1 
  case CC_C((CC_D(_, _, _),CC_D(_, _, _)), CC_A(_, _, _), CC_B(_, _, _)) => 2 
  case CC_C((CC_D(_, _, _),CC_D(_, _, _)), _, CC_B(_, _, _)) => 3 
  case CC_C((CC_D(_, _, _),CC_D(_, _, _)), _, _) => 4 
  case CC_C((CC_C(_, _, _),CC_D(_, _, _)), CC_A(_, _, _), _) => 5 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), _, _) => 6 
  case CC_C((CC_D(_, _, _),CC_D(_, _, _)), CC_A(_, _, _), _) => 7 
  case CC_C(_, _, CC_B(_, _, _)) => 8 
  case CC_C((CC_C(_, _, _),CC_D(_, _, _)), _, CC_B(_, _, _)) => 9 
  case CC_C((CC_D(_, _, _),CC_C(_, _, _)), _, _) => 10 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), CC_A(_, _, _), CC_B(_, _, _)) => 11 
  case CC_D(_, CC_A(_, _, _), _) => 12 
  case CC_D(_, CC_A(_, _, _), CC_B(_, _, _)) => 13 
}
}
// This is not matched: (CC_D (T_A (CC_B (CC_A (CC_B (CC_B Boolean
//                                   (CC_A (CC_B Boolean
//                                               Boolean
//                                               T_B
//                                               T_B
//                                               T_B
//                                               (T_A T_B T_B))
//                                         Boolean
//                                         T_B
//                                         T_B
//                                         T_B
//                                         T_B)
//                                   T_B
//                                   T_B
//                                   T_B
//                                   T_B)
//                             Boolean
//                             T_B
//                             T_B
//                             T_B
//                             T_B)
//                       (CC_B Boolean Boolean T_B T_B T_B T_B)
//                       T_B
//                       T_B
//                       T_B
//                       T_B)
//                 (CC_A Boolean
//                       (CC_B Boolean Boolean T_B T_B T_B (T_A T_B T_B))
//                       T_B
//                       T_B
//                       T_B
//                       T_B)
//                 T_B
//                 T_B
//                 T_B
//                 T_B)
//           (CC_C (T_A T_B T_B) (T_A T_B T_B) (T_A T_B T_B) (T_A T_B T_B)))
//      Wildcard
//      (CC_A (T_A (CC_B (CC_A (CC_B (CC_B Boolean
//                                         (CC_A (CC_B Boolean
//                                                     Boolean
//                                                     T_B
//                                                     T_B
//                                                     T_B
//                                                     T_B)
//                                               Boolean
//                                               T_B
//                                               T_B
//                                               T_B
//                                               T_B)
//                                         T_B
//                                         T_B
//                                         T_B
//                                         T_B)
//                                   Boolean
//                                   T_B
//                                   T_B
//                                   T_B
//                                   T_B)
//                             (CC_B Boolean Boolean T_B (T_A T_B T_B) T_B T_B)
//                             T_B
//                             T_B
//                             T_B
//                             T_B)
//                       (CC_A Boolean
//                             (CC_B Boolean Boolean T_B T_B T_B T_B)
//                             T_B
//                             T_B
//                             T_B
//                             T_B)
//                       T_B
//                       T_B
//                       T_B
//                       T_B)
//                 (CC_C (T_A T_B T_B)
//                       (T_A T_B T_B)
//                       (T_A T_B (T_A T_B T_B))
//                       (T_A T_B T_B)))
//            (CC_C T_B T_B T_B T_B)
//            (CC_C Wildcard Wildcard Wildcard T_B)
//            Wildcard
//            Wildcard
//            (T_A (CC_C T_B T_B T_B T_B)
//                 (T_A (CC_B (CC_A (CC_B (CC_B Boolean
//                                              (CC_A (CC_B Boolean
//                                                          Boolean
//                                                          T_B
//                                                          T_B
//                                                          T_B
//                                                          T_B)
//                                                    Boolean
//                                                    T_B
//                                                    T_B
//                                                    T_B
//                                                    T_B)
//                                              T_B
//                                              T_B
//                                              T_B
//                                              T_B)
//                                        Boolean
//                                        T_B
//                                        T_B
//                                        T_B
//                                        T_B)
//                                  (CC_B Boolean
//                                        Boolean
//                                        T_B
//                                        (T_A T_B T_B)
//                                        T_B
//                                        T_B)
//                                  T_B
//                                  T_B
//                                  T_B
//                                  T_B)
//                            (CC_A Boolean
//                                  (CC_B Boolean Boolean T_B T_B T_B T_B)
//                                  T_B
//                                  T_B
//                                  T_B
//                                  T_B)
//                            T_B
//                            T_B
//                            T_B
//                            T_B)
//                      (CC_C (T_A T_B T_B)
//                            (T_A T_B T_B)
//                            (T_A T_B (T_A T_B T_B))
//                            (T_A T_B T_B)))))
//      Wildcard
//      T_B)
// This is not matched: Pattern match is empty without constants
package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: C) extends T_A[C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A (CC_A (CC_A (CC_B Wildcard
//                        Wildcard
//                        (CC_A Wildcard Boolean Wildcard T_A)
//                        T_A)
//                  Boolean
//                  (CC_A (CC_A (CC_A (CC_B Wildcard
//                                          Wildcard
//                                          (CC_A (CC_A Wildcard
//                                                      Boolean
//                                                      (CC_B Char
//                                                            Wildcard
//                                                            Wildcard
//                                                            T_A)
//                                                      T_A)
//                                                Wildcard
//                                                (CC_B Wildcard
//                                                      Wildcard
//                                                      Wildcard
//                                                      T_A)
//                                                T_A)
//                                          T_A)
//                                    Boolean
//                                    (CC_B Char Wildcard Wildcard T_A)
//                                    T_A)
//                              Boolean
//                              Wildcard
//                              T_A)
//                        Wildcard
//                        (CC_B Wildcard
//                              Wildcard
//                              (CC_B Char
//                                    Wildcard
//                                    (CC_B Wildcard
//                                          Wildcard
//                                          (CC_B Wildcard Wildcard Wildcard T_A)
//                                          T_A)
//                                    T_A)
//                              T_A)
//                        T_A)
//                  T_A)
//            Boolean
//            (CC_B Wildcard Wildcard (CC_A Wildcard Boolean Wildcard T_A) T_A)
//            T_A)
//      Wildcard
//      Wildcard
//      T_A)
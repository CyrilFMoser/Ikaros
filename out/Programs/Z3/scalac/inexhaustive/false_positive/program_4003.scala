package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: Byte) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B (CC_B (CC_C (CC_B Wildcard
//                        (CC_A Wildcard Char T_A)
//                        (CC_A (CC_A (CC_A (CC_A (CC_A Wildcard Wildcard T_A)
//                                                Wildcard
//                                                T_A)
//                                          Wildcard
//                                          T_A)
//                                    Char
//                                    T_A)
//                              Wildcard
//                              T_A)
//                        T_A)
//                  T_A)
//            Wildcard
//            (CC_B (CC_C Wildcard T_A)
//                  (CC_A (CC_C (CC_B Wildcard Wildcard (CC_C Wildcard T_A) T_A)
//                              T_A)
//                        Char
//                        T_A)
//                  (CC_C Wildcard T_A)
//                  T_A)
//            T_A)
//      Wildcard
//      Wildcard
//      T_A)
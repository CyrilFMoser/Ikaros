package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: Byte) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_C Wildcard
//      Wildcard
//      (CC_A (CC_A Wildcard
//                  (CC_C (CC_A Wildcard
//                              (CC_A (CC_B Wildcard Wildcard Wildcard T_A)
//                                    (CC_C Wildcard Wildcard Wildcard T_A)
//                                    T_A)
//                              T_A)
//                        Wildcard
//                        (CC_C Wildcard
//                              Wildcard
//                              (CC_A Wildcard Wildcard T_A)
//                              T_A)
//                        T_A)
//                  T_A)
//            (CC_C Wildcard Wildcard Wildcard T_A)
//            T_A)
//      T_A)
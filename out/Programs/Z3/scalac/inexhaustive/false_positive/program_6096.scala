package Program_14 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_C(a: CC_A, b: (CC_A,CC_A), c: T_A) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
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
package Program_31 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: C) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C (CC_E Int
//            (CC_D (CC_A T_A)
//                  (CC_B Wildcard (CC_A T_A) T_A)
//                  (CC_B (CC_D Wildcard Wildcard Wildcard T_B)
//                        (CC_B (CC_E Int
//                                    (CC_D Wildcard
//                                          (CC_B Wildcard (CC_A T_A) T_A)
//                                          Wildcard
//                                          T_B)
//                                    T_B)
//                              (CC_A T_A)
//                              T_A)
//                        T_A)
//                  T_B)
//            T_B)
//      Wildcard
//      Wildcard
//      T_A)
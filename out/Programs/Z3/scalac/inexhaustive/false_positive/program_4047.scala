package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: D) extends T_A[C, D]

val v_a: CC_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_B (CC_A Wildcard
//                         (CC_A Wildcard Wildcard Wildcard T_A)
//                         (CC_A Wildcard
//                               (CC_B (CC_A (Tuple Wildcard Wildcard)
//                                           Wildcard
//                                           (CC_C (Tuple Wildcard Wildcard)
//                                                 Wildcard
//                                                 T_A)
//                                           T_A)
//                                     (Tuple (Tuple Char Byte) Wildcard)
//                                     (CC_C Wildcard Wildcard T_A)
//                                     T_A)
//                               (CC_C Wildcard Wildcard T_A)
//                               T_A)
//                         T_A)
//                   Wildcard
//                   (CC_A Wildcard
//                         (CC_C Wildcard Wildcard T_A)
//                         (CC_C Wildcard Wildcard T_A)
//                         T_A)
//                   T_A)
//             (CC_A Wildcard
//                   (CC_B Wildcard Wildcard (CC_C Wildcard Wildcard T_A) T_A)
//                   (CC_A Wildcard Wildcard Wildcard T_A)
//                   T_A))
//      Wildcard
//      (CC_A Wildcard
//            (CC_C Wildcard
//                  (CC_B Wildcard
//                        Wildcard
//                        (CC_A Wildcard
//                              (CC_C Wildcard Wildcard T_A)
//                              Wildcard
//                              T_A)
//                        T_A)
//                  T_A)
//            (CC_C Wildcard Wildcard T_A)
//            T_A)
//      T_A)
package Program_14 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[C], b: T_B[Int]) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char))
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
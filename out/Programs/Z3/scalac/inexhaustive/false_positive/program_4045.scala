package Program_15 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, Boolean], b: T_A[E, E], c: (Int,Int)) extends T_A[C, D]

val v_a: CC_A[Int, Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (12,12)) => 0 
  case CC_A(CC_A(_, _, _), _, (_,_)) => 1 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), (12,12)) => 2 
}
}
// This is not matched: (CC_A Int
//      Char
//      Int
//      (CC_A Boolean
//            Char
//            Boolean
//            Wildcard
//            (CC_A Boolean
//                  Boolean
//                  Boolean
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_A Boolean Boolean))
//            Wildcard
//            (T_A Char Boolean))
//      Wildcard
//      Wildcard
//      (T_A Char Int))
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
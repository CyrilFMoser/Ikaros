package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Char, C]
case class CC_C[E](a: T_A[E, E], b: CC_A[E], c: T_A[Char, E]) extends T_A[Char, E]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, CC_A()) => 1 
}
}
// This is not matched: (CC_B (CC_C Char (T_A Char))
//      (CC_D (Tuple Char Byte)
//            (CC_A Wildcard Wildcard Wildcard Wildcard)
//            (CC_D (CC_A Boolean Boolean Boolean Boolean)
//                  (CC_A Boolean Boolean Boolean Boolean)
//                  (CC_D (CC_A Boolean Boolean Boolean Boolean)
//                        (CC_A Boolean Boolean Boolean Boolean)
//                        Wildcard
//                        Wildcard
//                        (T_B (CC_A Boolean Boolean Boolean Boolean)
//                             (CC_A Boolean Boolean Boolean Boolean)))
//                  Wildcard
//                  (T_B (CC_A Boolean Boolean Boolean Boolean)
//                       (CC_A Boolean Boolean Boolean Boolean)))
//            (CC_A Wildcard
//                  (CC_D Char
//                        Int
//                        (CC_D Int
//                              Int
//                              Wildcard
//                              (CC_A Wildcard
//                                    (CC_D Char
//                                          Int
//                                          Wildcard
//                                          Wildcard
//                                          (T_B Int Char))
//                                    Wildcard
//                                    (T_A Char))
//                              (T_B Int Int))
//                        Wildcard
//                        (T_B Int Char))
//                  (CC_C Char (T_A Char))
//                  (T_A Char))
//            (T_B (CC_A Wildcard Wildcard Wildcard Wildcard) (Tuple Char Byte)))
//      Wildcard
//      (T_A Char))
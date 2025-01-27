package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D, E](a: T_B[D], b: Byte, c: T_A[D]) extends T_A[D]
case class CC_C[F]() extends T_A[F]
case class CC_D[G](a: CC_C[G], b: G, c: T_A[G]) extends T_B[CC_B[Char, (Char,Int)]]
case class CC_E[H]() extends T_B[H]
case class CC_F() extends T_B[CC_B[Char, (Char,Int)]]

val v_a: T_B[CC_B[Char, (Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_F() => 0 
  case CC_E() => 1 
  case CC_D(_, _, CC_A()) => 2 
  case CC_D(CC_C(), _, CC_A()) => 3 
  case CC_D(_, _, CC_C()) => 4 
  case CC_D(CC_C(), _, CC_C()) => 5 
  case CC_D(_, _, CC_B(_, _, _)) => 6 
  case CC_D(CC_C(), _, CC_B(_, _, _)) => 7 
}
}
// This is not matched: (CC_D (T_A (CC_A (CC_A (CC_B Boolean
//                             (CC_D Boolean Boolean Boolean Boolean Boolean)
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean)
//                       (T_A Boolean))
//                 Boolean))
//      (CC_C (T_A (CC_A (CC_A (CC_B Boolean
//                                   (CC_D Boolean
//                                         Boolean
//                                         Boolean
//                                         Boolean
//                                         (T_A Boolean))
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean)
//                             Boolean)
//                       Boolean))
//            (T_A (T_A (CC_A (CC_A (CC_B Boolean
//                                        (CC_D Boolean
//                                              Boolean
//                                              Boolean
//                                              Boolean
//                                              (T_A Boolean))
//                                        Boolean
//                                        Boolean
//                                        Boolean
//                                        Boolean)
//                                  Boolean)
//                            Boolean))))
//      (CC_B (CC_A (CC_A (CC_B Boolean
//                              (CC_D Boolean Boolean Boolean Boolean Boolean)
//                              Boolean
//                              Boolean
//                              Boolean
//                              Boolean)
//                        Boolean)
//                  Boolean)
//            Boolean
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_A (CC_A (CC_A (CC_B Boolean
//                                   (CC_D Boolean
//                                         Boolean
//                                         Boolean
//                                         Boolean
//                                         Boolean)
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean)
//                             Boolean)
//                       Boolean)))
//      Wildcard
//      (T_B (CC_B Char (Tuple Char Int) Boolean Boolean Boolean Boolean)))
// This is not matched: (CC_B Int Byte Wildcard Wildcard Wildcard (T_A Int Byte))
package Program_29 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: ((Int,Byte),Boolean)) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_)) => 0 
}
}
// This is not matched: (CC_A (CC_A Boolean Boolean Boolean) Wildcard (T_A Char))
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
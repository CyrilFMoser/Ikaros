package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: T_A[B]) extends T_A[B]
case class CC_B[D]() extends T_A[D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 1 
  case CC_A(CC_B(), CC_A(_, _)) => 2 
  case CC_A(CC_B(), CC_B()) => 3 
  case CC_A(CC_A(_, _), _) => 4 
}
}
// This is not matched: (CC_A Int
//      (T_A (T_A (T_A (CC_A (CC_A Boolean Boolean Boolean Boolean Boolean)
//                           (T_A (CC_B Boolean Boolean))
//                           Boolean
//                           Boolean
//                           Boolean))))
//      (CC_A (T_A (T_A (T_A (CC_A (CC_A Boolean
//                                       Boolean
//                                       Boolean
//                                       Boolean
//                                       (T_A Boolean))
//                                 (T_A (CC_B Boolean (T_A Boolean)))
//                                 Boolean
//                                 Boolean
//                                 Boolean))))
//            Boolean
//            Wildcard
//            (CC_A (T_A (T_A (T_A (CC_A (CC_A Boolean
//                                             Boolean
//                                             Boolean
//                                             Boolean
//                                             (T_A Boolean))
//                                       (T_A (CC_B Boolean (T_A Boolean)))
//                                       Boolean
//                                       Boolean
//                                       Boolean))))
//                  Boolean
//                  Wildcard
//                  Wildcard
//                  (T_A (T_A (T_A (T_A (CC_A (CC_A Boolean
//                                                  Boolean
//                                                  Boolean
//                                                  Boolean
//                                                  (T_A Boolean))
//                                            (T_A (CC_B Boolean (T_A Boolean)))
//                                            Boolean
//                                            Boolean
//                                            Boolean))))))
//            (T_A (T_A (T_A (T_A (CC_A (CC_A Boolean
//                                            Boolean
//                                            Boolean
//                                            Boolean
//                                            (T_A Boolean))
//                                      (T_A (CC_B Boolean (T_A Boolean)))
//                                      Boolean
//                                      Boolean
//                                      Boolean))))))
//      Wildcard
//      (T_A Int))
// This is not matched: (CC_B Boolean Wildcard (T_A (T_A Byte)))
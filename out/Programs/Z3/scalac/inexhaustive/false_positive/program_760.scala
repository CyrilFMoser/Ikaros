package Program_28 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: T_A[B], c: T_A[C]) extends T_A[B]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: Byte) extends T_A[T_A[Byte]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_C(_)) => 1 
  case CC_A(CC_A(_, _, _), CC_B(), CC_C(_)) => 2 
  case CC_A(CC_B(), _, CC_C(_)) => 3 
  case CC_A(CC_C(_), CC_A(_, _, _), CC_B()) => 4 
  case CC_A(CC_C(_), _, CC_C(_)) => 5 
  case CC_A(CC_B(), CC_B(), CC_B()) => 6 
  case CC_A(_, _, _) => 7 
  case CC_A(CC_A(_, _, _), _, CC_B()) => 8 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C(_)) => 9 
  case CC_A(CC_A(_, _, _), _, CC_C(_)) => 10 
  case CC_A(CC_B(), CC_A(_, _, _), CC_B()) => 11 
  case CC_A(CC_B(), CC_A(_, _, _), _) => 12 
}
}
// This is not matched: (CC_A Int
//      (CC_B (CC_B (CC_A Boolean Boolean Boolean Boolean Boolean (T_A Boolean))
//                  Boolean)
//            (T_A Boolean))
//      (CC_A (CC_B (CC_B (CC_A Boolean Boolean Boolean Boolean Boolean Boolean)
//                        Boolean)
//                  Boolean)
//            (T_A Byte)
//            (CC_C Byte (T_A (T_A Byte)))
//            Wildcard
//            (CC_B (T_A Byte) (T_A (T_A Byte)))
//            (T_A (CC_B (CC_B (CC_A Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean)
//                             Boolean)
//                       Boolean)))
//      (CC_A Int
//            (T_A Boolean)
//            (CC_B (T_A Boolean) (T_A (T_A Boolean)))
//            Wildcard
//            Wildcard
//            (T_A Int))
//      (CC_B (CC_B (CC_B (CC_A Boolean
//                              Boolean
//                              Boolean
//                              Boolean
//                              Boolean
//                              (T_A Boolean))
//                        Boolean)
//                  Boolean)
//            (T_A (CC_B (CC_B (CC_A Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   Boolean
//                                   (T_A Boolean))
//                             Boolean)
//                       Boolean)))
//      (T_A Int))
// This is not matched: (CC_A Int
//      Char
//      (CC_A Int
//            Int
//            (CC_A Int Int Wildcard Wildcard Int (T_A Int Int))
//            Wildcard
//            Wildcard
//            (T_A Int Int))
//      Wildcard
//      Wildcard
//      (T_A Int Char))
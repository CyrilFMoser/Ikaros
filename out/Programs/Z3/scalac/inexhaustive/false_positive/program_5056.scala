package Program_15 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[Boolean, C]
case class CC_B(a: (Byte,Byte)) extends T_A[Boolean, T_A[Boolean, Boolean]]
case class CC_C[D](a: Int, b: CC_B, c: D) extends T_A[Boolean, T_A[Boolean, Boolean]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_B(_) => 1 
  case CC_B((_,0)) => 2 
  case CC_C(_, _, _) => 3 
  case CC_A(_, _) => 4 
}
}
// This is not matched: (CC_C Boolean Int Wildcard Wildcard (T_A Boolean (T_A Boolean Boolean)))
// This is not matched: (CC_C (T_A (T_A (CC_A Boolean
//                      (T_A Boolean Boolean)
//                      (T_A Boolean Boolean)
//                      (T_A Boolean Boolean)
//                      (T_A Boolean Boolean))
//                (CC_A Boolean
//                      (T_A Boolean Boolean)
//                      (T_A (T_A Boolean Boolean) Boolean)
//                      (T_A Boolean Boolean)
//                      (T_A Boolean Boolean)))
//           (CC_A Boolean
//                 (T_A Boolean Boolean)
//                 (T_A Boolean Boolean)
//                 (T_A Boolean Boolean)
//                 (T_A Boolean Boolean)))
//      (CC_B Boolean
//            (T_A (T_A (CC_A Boolean
//                            (T_A Boolean Boolean)
//                            (T_A Boolean Boolean)
//                            (T_A Boolean Boolean)
//                            (T_A Boolean Boolean))
//                      (CC_A Boolean
//                            (T_A Boolean Boolean)
//                            (T_A (T_A Boolean Boolean) Boolean)
//                            (T_A Boolean Boolean)
//                            (T_A Boolean Boolean)))
//                 (CC_A Boolean Boolean Boolean Boolean Boolean)))
//      (T_A (T_A (T_A (CC_A Boolean
//                           (T_A Boolean Boolean)
//                           (T_A Boolean Boolean)
//                           (T_A Boolean Boolean)
//                           (T_A Boolean Boolean))
//                     (CC_A Boolean
//                           (T_A Boolean Boolean)
//                           (T_A (T_A Boolean Boolean) Boolean)
//                           (T_A Boolean Boolean)
//                           (T_A Boolean Boolean)))
//                (CC_A Boolean
//                      (T_A Boolean Boolean)
//                      (T_A Boolean Boolean)
//                      (T_A Boolean Boolean)
//                      (T_A Boolean Boolean)))
//           (CC_A Byte Boolean Boolean Boolean Boolean)))
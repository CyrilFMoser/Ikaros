package Program_29 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: B, c: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: T_A[C], b: CC_A[C], c: T_A[D]) extends T_A[C]
case class CC_C(a: T_A[Byte], b: T_A[(Byte,Boolean)]) extends T_A[T_A[Char]]

val v_a: CC_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _), CC_B(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _, _)) => 1 
  case CC_A(CC_C(_, _), _, CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_A (CC_C Boolean Boolean (T_A (T_A Boolean)))
//      Wildcard
//      Wildcard
//      (CC_B (CC_C Boolean Boolean (T_A Boolean))
//            Boolean
//            (CC_A (CC_C Boolean Byte Boolean)
//                  Wildcard
//                  (CC_C Wildcard Wildcard (T_A (T_A Char)))
//                  (CC_B (CC_C Boolean (T_A Boolean) Boolean)
//                        Boolean
//                        Wildcard
//                        Wildcard
//                        Wildcard
//                        (T_A (CC_C Boolean (T_A Boolean) Boolean)))
//                  (T_A (CC_C Boolean Byte Boolean)))
//            (CC_A (CC_C Boolean Boolean Boolean)
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_A (CC_C Boolean Boolean Boolean)))
//            Wildcard
//            (T_A (CC_C Boolean Boolean (T_A Boolean))))
//      (T_A (CC_C Boolean Boolean (T_A (T_A Boolean)))))
// This is not matched: (CC_A Int
//      (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Int
//           (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))))
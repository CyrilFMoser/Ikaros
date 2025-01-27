package Program_14 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[Char, F], b: ((Char,Boolean),Boolean), c: T_B[Byte, E]) extends T_A[E, F]
case class CC_B[G, H](a: T_A[G, H], b: T_A[H, H]) extends T_A[Int, G]
case class CC_C[I](a: T_A[I, I]) extends T_B[I, T_A[Boolean, Int]]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_B(CC_A(_, _, _), CC_B(_, _)) => 2 
}
}
// This is not matched: (CC_B Int
//      Int
//      (CC_B Int
//            Boolean
//            Wildcard
//            (CC_A Boolean
//                  Boolean
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_A Boolean Boolean))
//            (T_A Int Int))
//      (CC_B Int
//            (T_B Boolean
//                 (T_A (CC_C Boolean Boolean (T_A Boolean Boolean)) Boolean))
//            (CC_A Int
//                  (T_B Boolean (T_A (CC_C Boolean Boolean Boolean) Boolean))
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_A Int
//                       (T_B Boolean
//                            (T_A (CC_C Boolean Boolean Boolean) Boolean))))
//            Wildcard
//            (T_A Int Int))
//      (T_A Int Int))
// This is not matched: (CC_C Char Wildcard Wildcard Wildcard (T_A Char Boolean))
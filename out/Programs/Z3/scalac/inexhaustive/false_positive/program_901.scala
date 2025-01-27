package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: D, b: (Char,(Char,Byte)), c: T_A[E, C]) extends T_A[C, D]
case class CC_B[F](a: CC_A[F, F, F]) extends T_A[F, CC_A[Byte, Char, Char]]

val v_a: T_A[Int, CC_A[Byte, Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_A(CC_A(_, _, _), ('x',(_,_)), CC_A(_, _, _)) => 2 
  case CC_A(CC_A(_, _, _), ('x',(_,_)), _) => 3 
}
}
// This is not matched: (CC_A Int
//      (CC_A Byte Char Char Boolean Boolean Boolean Boolean)
//      (CC_A Boolean
//            (CC_B Boolean (T_A Boolean Boolean) Boolean)
//            Boolean
//            Boolean
//            Boolean
//            Boolean
//            Boolean)
//      Wildcard
//      Wildcard
//      (CC_A (CC_A Boolean
//                  (CC_B Boolean Boolean Boolean)
//                  Boolean
//                  Boolean
//                  Boolean
//                  Boolean
//                  Boolean)
//            Int
//            Boolean
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_A (CC_A Boolean
//                       (CC_B Boolean Boolean Boolean)
//                       Boolean
//                       Boolean
//                       Boolean
//                       Boolean
//                       Boolean)
//                 Int))
//      (T_A Int (CC_A Byte Char Char Boolean Boolean Boolean Boolean)))
// This is not matched: (CC_A Int
//      (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Int
//           (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))))
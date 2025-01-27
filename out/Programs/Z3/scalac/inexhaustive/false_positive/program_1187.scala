package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: Char, b: T_A[Byte, D], c: T_A[E, D]) extends T_A[C, D]
case class CC_B[F, G]() extends T_A[F, G]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 1 
  case CC_A(_, CC_B(), CC_B()) => 2 
  case CC_A(_, CC_A(_, _, _), _) => 3 
}
}
// This is not matched: (CC_A Int
//      Byte
//      Boolean
//      Wildcard
//      (CC_A Int
//            Byte
//            (CC_A Boolean
//                  Boolean
//                  (T_A Boolean Boolean)
//                  Boolean
//                  Boolean
//                  Boolean
//                  Boolean)
//            Char
//            (CC_B Byte Int (T_A Byte Int))
//            (CC_B (CC_A Boolean
//                        Boolean
//                        (T_A Boolean Boolean)
//                        Boolean
//                        Boolean
//                        Boolean
//                        Boolean)
//                  Int
//                  (T_A (CC_A Boolean
//                             Boolean
//                             (T_A Boolean Boolean)
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean)
//                       Int))
//            (T_A Byte Int))
//      Wildcard
//      (T_A Byte Int))
// This is not matched: Pattern match is empty without constants
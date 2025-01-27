package Program_31 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: Byte, b: T_A[D, E]) extends T_A[C, D]

val v_a: CC_A[Int, Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(0, _) => 1 
}
}
// This is not matched: (CC_A Int
//      Byte
//      Char
//      Wildcard
//      (CC_A Char
//            Int
//            (CC_A Boolean Boolean Boolean Boolean Boolean Boolean)
//            Byte
//            (CC_A (CC_A Boolean
//                        Boolean
//                        Boolean
//                        Boolean
//                        (T_A Boolean Boolean)
//                        Boolean)
//                  Char
//                  Boolean
//                  Byte
//                  Wildcard
//                  (T_A Char
//                       (CC_A Boolean
//                             Boolean
//                             Boolean
//                             Boolean
//                             (T_A Boolean Boolean)
//                             Boolean)))
//            (T_A Int Char))
//      (T_A Byte Int))
// This is not matched: (CC_A Byte (CC_A Byte Wildcard (T_A Byte)) (T_A Byte))
package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[C, (Byte,Int)]
case class CC_B[D, E](a: E, b: E) extends T_A[D, (Byte,Int)]
case class CC_C[F](a: F, b: F) extends T_A[F, CC_B[Char, (Int,Boolean)]]

val v_a: CC_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B(0, 0) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A (Tuple (CC_A Wildcard
//                   (CC_C Wildcard
//                         (CC_C Wildcard
//                               (CC_C Wildcard
//                                     (CC_B (CC_A Wildcard Wildcard Boolean T_A)
//                                           T_A)
//                                     T_A)
//                               T_A)
//                         T_A)
//                   Boolean
//                   T_A)
//             (CC_B Wildcard T_A))
//      Wildcard
//      Wildcard
//      T_A)
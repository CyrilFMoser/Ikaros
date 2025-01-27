package Program_31 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[C]) extends T_A[C]
case class CC_B[E](a: CC_A[E, E], b: CC_A[E, E]) extends T_A[E]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: (CC_A (CC_D T_B T_B)
//      Char
//      (CC_D (CC_A T_B
//                  (CC_C Wildcard Wildcard)
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_A T_B (CC_C Wildcard Wildcard)))
//            T_B)
//      (Tuple (CC_C (CC_A Byte
//                         Char
//                         (CC_C (CC_A Byte
//                                     Char
//                                     Wildcard
//                                     Wildcard
//                                     Wildcard
//                                     (T_A Byte Char))
//                               T_B)
//                         Wildcard
//                         Char
//                         (T_A Byte Char))
//                   T_B)
//             (CC_D (CC_A T_B
//                         (CC_C Boolean T_B)
//                         Wildcard
//                         Wildcard
//                         (CC_C Wildcard T_B)
//                         (T_A T_B (CC_C Boolean T_B)))
//                   T_B))
//      Wildcard
//      (T_A (CC_D T_B T_B) Char))
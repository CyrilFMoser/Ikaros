package Program_28 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, C], b: T_A[E, D]) extends T_A[C, D]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Byte Boolean Wildcard Wildcard (T_A Boolean Byte))
// This is not matched: (CC_A Wildcard
//      (Tuple Int
//             (CC_A (CC_B (CC_A Wildcard Wildcard T_A) T_A)
//                   (Tuple Wildcard Wildcard)
//                   T_A))
//      T_A)
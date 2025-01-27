package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: T_A[D, Char]) extends T_A[D, C]
case class CC_B[F, E, G](a: (Boolean,Boolean)) extends T_A[E, F]
case class CC_C[H](a: T_A[H, H], b: H, c: T_A[H, Char]) extends T_A[H, Char]

val v_a: CC_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_)) => 0 
}
}
// This is not matched: (CC_A Byte
//      Boolean
//      Wildcard
//      (CC_C Boolean
//            Wildcard
//            Wildcard
//            (CC_B Char
//                  Boolean
//                  Boolean
//                  (Tuple Wildcard Boolean)
//                  (T_A Boolean Char))
//            (T_A Boolean Char))
//      (T_A Boolean Byte))
// This is not matched: (CC_A Wildcard (CC_A Wildcard Wildcard T_A) T_A)
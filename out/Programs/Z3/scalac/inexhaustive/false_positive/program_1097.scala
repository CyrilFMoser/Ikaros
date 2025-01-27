package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Boolean, Boolean]) extends T_A[T_B[Char, Boolean]]
case class CC_B[E, D](a: T_B[E, E], b: T_B[E, E]) extends T_B[E, D]
case class CC_C[F, G](a: CC_A) extends T_B[F, CC_B[CC_A, Int]]

val v_a: T_B[Byte, CC_B[CC_A, Int]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_C Byte
//      Boolean
//      Wildcard
//      (T_B Byte
//           (CC_B (CC_A (T_A Boolean) (T_A (T_A Boolean)))
//                 Int
//                 Boolean
//                 Boolean
//                 Boolean)))
// This is not matched: (CC_B Wildcard Wildcard T_A)
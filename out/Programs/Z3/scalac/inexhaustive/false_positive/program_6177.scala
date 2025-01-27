package Program_14 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Int, Byte], b: T_B[Byte, Byte], c: T_A[Int, Int]) extends T_A[T_A[Char, Char], T_A[Byte, Byte]]
case class CC_B[E, F](a: E, b: CC_A, c: CC_A) extends T_B[E, F]
case class CC_C[G, H](a: CC_A, b: CC_A, c: CC_B[CC_A, CC_A]) extends T_B[CC_B[Boolean, CC_A], G]
case class CC_D[I, J](a: CC_A, b: Byte) extends T_B[J, I]

val v_a: T_B[CC_B[Boolean, CC_A], CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_D(_, _) => 1 
  case CC_C(_, _, CC_B(_, _, _)) => 2 
  case CC_C(CC_A(_, _, _), _, _) => 3 
}
}
// This is not matched: (CC_C (CC_A (T_A Boolean Boolean) Boolean Boolean Boolean)
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_B Boolean
//                 (CC_A Boolean Boolean Boolean Boolean)
//                 Boolean
//                 Boolean
//                 Boolean
//                 Boolean)
//           (CC_A (T_A Boolean Boolean) Boolean Boolean Boolean)))
// This is not matched: (CC_C (CC_C Wildcard (CC_A T_A) Wildcard T_A) Wildcard Wildcard T_A)
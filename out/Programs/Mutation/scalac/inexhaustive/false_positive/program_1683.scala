package Program_59 

package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: E) extends T_A[D, E]
case class CC_B[F](a: Char, b: F) extends T_A[Byte, F]
case class CC_C(a: T_B[Char], b: T_A[Boolean, Boolean]) extends T_B[T_A[Boolean, Byte]]
case class CC_D(a: T_A[Byte, CC_C], b: Char) extends T_B[T_A[Boolean, Byte]]
case class CC_E[G](a: CC_C, b: Byte) extends T_B[T_B[CC_D]]

val v_a: T_B[T_B[CC_D]] = null
val v_b: Int = v_a match{
  case CC_E(_, _) => 0 
}
}
// This is not matched: (CC_E Boolean Wildcard Wildcard (T_B (T_B (CC_D Boolean Boolean Boolean))))
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _, _)
// }
//
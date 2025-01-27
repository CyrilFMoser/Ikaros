package Program_30 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: Char, b: CC_A[Byte], c: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: F) extends T_A[F]
case class CC_D[G, H](a: H) extends T_B[G, T_A[Byte]]
case class CC_E(a: CC_B[Byte]) extends T_B[T_A[Int], T_A[Byte]]
case class CC_F(a: Byte, b: T_A[(Int,Char)]) extends T_B[T_A[Int], T_A[Byte]]

val v_a: T_B[CC_F, T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
}
}
// This is not matched: (CC_D (CC_F Boolean Boolean Boolean)
//      (CC_C Boolean Boolean Boolean)
//      (CC_C Boolean Boolean (T_A Boolean))
//      (T_B (CC_F Boolean Boolean Boolean) (T_A Byte)))
// This is not matched: (CC_D (CC_B Wildcard Wildcard Wildcard T_A)
//      Wildcard
//      Wildcard
//      (T_B (CC_A T_A) (CC_A T_A)))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
// }
//
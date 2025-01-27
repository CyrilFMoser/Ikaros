package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E]) extends T_A[Byte, E]
case class CC_B[F, G](a: F, b: F) extends T_A[Char, F]
case class CC_C[H](a: H, b: (Boolean,(Boolean,Char))) extends T_A[CC_A[H], H]
case class CC_D[I, J](a: Boolean, b: T_A[Byte, J]) extends T_B[T_B[Char, Byte], I]
case class CC_E(a: CC_D[Boolean, Boolean], b: CC_A[(Byte,Char)]) extends T_B[T_B[Char, Byte], T_A[Byte, Char]]
case class CC_F[K](a: (CC_E,Byte)) extends T_B[T_B[Char, Byte], K]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard (T_A Char Int))
// This is not matched: (CC_B Wildcard (T_A (T_A (Tuple Boolean Int))))
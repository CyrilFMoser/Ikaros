package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, F], b: E) extends T_A[E, T_A[Byte, Byte]]
case class CC_B[G](a: T_B[G, G], b: Boolean) extends T_B[G, T_B[G, G]]
case class CC_C[H, I](a: Boolean, b: H) extends T_B[I, H]
case class CC_D[K, J](a: T_B[K, J]) extends T_B[J, K]

val v_a: T_A[Char, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(CC_A(_, _), 'x') => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char (T_A Byte Byte)))
// This is not matched: (CC_A T_A)
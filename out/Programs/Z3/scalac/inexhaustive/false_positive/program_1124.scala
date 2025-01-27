package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: Byte, b: T_B, c: T_B) extends T_A[C, D]
case class CC_B[E, F](a: T_A[F, F], b: T_A[E, F], c: T_A[F, E]) extends T_A[F, E]
case class CC_C[G, H]() extends T_A[G, H]
case class CC_D[I](a: I, b: CC_C[I, I]) extends T_B
case class CC_E(a: CC_C[T_B, T_B]) extends T_B

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(12, _) => 0 
  case CC_D(12, CC_C()) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B T_A)
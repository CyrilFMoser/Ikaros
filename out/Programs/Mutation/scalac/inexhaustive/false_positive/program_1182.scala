package Program_62 

package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B, b: D) extends T_A[C, T_B]
case class CC_B[E](a: T_B) extends T_A[T_A[T_B, T_B], E]
case class CC_C[F](a: Int, b: T_A[F, T_B]) extends T_A[T_A[T_B, T_B], F]
case class CC_D() extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Char T_B (CC_D T_B) Wildcard (T_A Char T_B))
// This is not matched: (CC_A Boolean Wildcard Wildcard Byte (T_A (Tuple Boolean Int)))
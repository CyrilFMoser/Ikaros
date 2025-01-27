package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E]() extends T_A[D, C]
case class CC_B[F](a: T_A[T_B, F]) extends T_A[T_A[Boolean, F], F]
case class CC_C[G](a: T_A[G, G], b: T_A[G, G], c: Char) extends T_A[T_A[Boolean, G], G]
case class CC_D(a: T_A[T_B, T_B], b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _) => 0 
}
}
// This is not matched: (CC_D (CC_A T_B T_B T_B (T_A T_B T_B)) Wildcard T_B)
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)
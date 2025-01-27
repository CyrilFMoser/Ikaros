package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B[D, E]() extends T_A[Boolean, D]
case class CC_C[F](a: T_A[Boolean, F], b: CC_B[F, F]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Boolean, CC_D] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B (CC_D (T_A T_B T_B)) T_B (T_A Boolean (CC_D (T_A T_B T_B))))
// This is not matched: (CC_B Int Wildcard Wildcard Wildcard (T_A (Tuple T_B T_B) Int))
package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Char, c: T_B[D]) extends T_A[T_A[T_B[D], D], D]
case class CC_B[E](a: T_B[E], b: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: F, b: T_B[F]) extends T_B[F]
case class CC_D[G]() extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_D()
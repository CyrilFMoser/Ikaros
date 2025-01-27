package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[T_B[T_B[Byte, Char], Byte]]
case class CC_B[E](a: CC_A[E], b: Char, c: T_A[T_B[E, E]]) extends T_B[T_A[T_B[Byte, Char]], E]
case class CC_C[F](a: CC_B[F]) extends T_B[T_A[T_B[Byte, Char]], F]
case class CC_D[G, H]() extends T_B[G, H]

val v_a: T_B[T_A[T_B[Byte, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C(CC_B(_, _, _))
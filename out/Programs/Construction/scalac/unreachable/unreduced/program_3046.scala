package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E](a: CC_A[E], b: T_A[E, E]) extends T_A[E, T_B[E]]
case class CC_C[F](a: Byte, b: T_A[F, T_B[F]]) extends T_B[F]

val v_a: T_A[Char, T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, CC_A(_))) => 0 
  case CC_B(CC_A(CC_C(_, _)), _) => 1 
}
}
// This is not matched: CC_A(CC_C(_, CC_B(_, _)))
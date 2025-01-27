package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_B[E, E]], b: T_A[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_B[F, F], b: F) extends T_B[T_B[T_A[Byte, Char], Boolean], F]
case class CC_C[G]() extends T_B[T_B[T_A[Byte, Char], Boolean], G]
case class CC_D[H](a: Char, b: H) extends T_B[T_B[T_A[Byte, Char], Boolean], H]

val v_a: T_B[T_B[T_A[Byte, Char], Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_D(_, _)
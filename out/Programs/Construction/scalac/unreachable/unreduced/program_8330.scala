package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_B[CC_A, Boolean]]) extends T_A[T_A[Char]]
case class CC_C(a: Char, b: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_D[D](a: T_A[T_A[Char]], b: CC_C, c: CC_B) extends T_B[D, T_A[T_A[Char]]]
case class CC_E[E]() extends T_B[Char, E]
case class CC_F[F](a: T_B[Char, F], b: Int) extends T_B[Char, F]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C('x', _) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_A()
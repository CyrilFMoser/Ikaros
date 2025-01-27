package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[D, D], D], b: Char, c: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_B() extends T_A[T_A[T_A[T_A[Char, Char], CC_A[Char]], T_A[T_A[Char, Char], CC_A[Char]]], T_A[T_A[Char, Char], CC_A[Char]]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]
case class CC_D[F](a: CC_A[F], b: T_A[F, CC_B], c: Int) extends T_B[F]
case class CC_E[G](a: Byte, b: G) extends T_B[G]
case class CC_F[H](a: Char, b: H) extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, _) => 1 
  case CC_F(_, _) => 2 
}
}
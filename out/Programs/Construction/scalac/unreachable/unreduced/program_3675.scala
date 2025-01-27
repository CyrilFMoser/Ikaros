package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int, b: T_A[D, T_A[D, D]], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: (T_A[Char, Int],T_A[Byte, Char]), b: T_A[E, E], c: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: T_B[F], b: Int) extends T_B[F]
case class CC_D[G](a: Char, b: T_A[G, G], c: T_B[G]) extends T_B[G]
case class CC_E[H]() extends T_B[H]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
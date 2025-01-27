package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Char) extends T_A[D, T_A[D, T_B[D]]]
case class CC_B[E](a: T_B[E], b: (T_A[Byte, Byte],T_A[Int, Boolean]), c: T_A[E, E]) extends T_A[E, T_A[E, T_B[E]]]
case class CC_C[F, G]() extends T_A[F, T_A[F, T_B[F]]]
case class CC_D[H](a: T_B[H], b: Int, c: CC_C[T_A[H, H], H]) extends T_B[H]

val v_a: T_A[Char, T_A[Char, T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A('x', 'x') => 0 
  case CC_A('x', _) => 1 
  case CC_A(_, 'x') => 2 
  case CC_A(_, _) => 3 
  case CC_B(CC_D(CC_D(_, _, _), _, CC_C()), _, _) => 4 
  case CC_C() => 5 
}
}
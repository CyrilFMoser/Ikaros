package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D, c: (Int,T_B[Byte])) extends T_A[(Boolean,T_B[Char]), D]
case class CC_B[E](a: E, b: T_A[T_B[E], E]) extends T_A[T_B[E], E]
case class CC_C[F]() extends T_A[(Boolean,T_B[Char]), F]
case class CC_D[G](a: G, b: CC_C[G], c: T_B[G]) extends T_B[G]
case class CC_E[H](a: CC_D[H]) extends T_B[H]
case class CC_F() extends T_B[Char]

val v_a: T_A[(Boolean,T_B[Char]), T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _, _), _) => 0 
  case CC_A(_, CC_E(_), _) => 1 
  case CC_A(_, CC_F(), _) => 2 
  case CC_C() => 3 
}
}
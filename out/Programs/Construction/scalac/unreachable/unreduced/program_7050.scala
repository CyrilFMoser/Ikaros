package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int) extends T_A[T_A[(Boolean,Boolean), T_A[Char, Char]], D]
case class CC_B[E](a: Byte, b: E) extends T_A[T_A[(Boolean,Boolean), T_A[Char, Char]], E]
case class CC_C[F](a: T_A[F, F], b: T_A[F, F]) extends T_A[T_A[(Boolean,Boolean), T_A[Char, Char]], F]
case class CC_D[G, H]() extends T_B[G]
case class CC_E[I]() extends T_B[I]

val v_a: T_A[T_A[(Boolean,Boolean), T_A[Char, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}
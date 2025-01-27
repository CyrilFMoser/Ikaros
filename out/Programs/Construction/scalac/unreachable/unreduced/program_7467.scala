package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_B[T_B[(Boolean,Char)]], D]
case class CC_B[E](a: T_A[E, E], b: T_B[T_B[E]], c: CC_A[E]) extends T_A[T_B[T_B[(Boolean,Char)]], E]
case class CC_C[F](a: T_B[F], b: Int, c: T_A[CC_A[F], F]) extends T_A[T_B[T_B[(Boolean,Char)]], F]
case class CC_D[G](a: G) extends T_B[G]
case class CC_E[H]() extends T_B[H]
case class CC_F[I]() extends T_B[I]

val v_a: T_A[T_B[T_B[(Boolean,Char)]], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(12)) => 0 
  case CC_A(CC_D(_)) => 1 
  case CC_A(CC_E()) => 2 
  case CC_A(CC_F()) => 3 
  case CC_B(_, _, _) => 4 
  case CC_C(_, _, _) => 5 
}
}
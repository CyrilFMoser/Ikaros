package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: E, b: Char, c: Char) extends T_A[E]
case class CC_C[F](a: T_B[F, F]) extends T_A[F]
case class CC_D[G](a: T_A[Int]) extends T_B[T_A[T_A[G]], G]
case class CC_E[H](a: (T_A[(Boolean,Char)],CC_D[(Char,Byte)]), b: Char) extends T_B[T_A[T_A[H]], H]
case class CC_F[I, J](a: T_A[J], b: I) extends T_B[T_A[T_A[I]], I]

val v_a: T_B[T_A[T_A[Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
  case CC_D(CC_B(_, _, _)) => 1 
  case CC_D(CC_C(_)) => 2 
  case CC_E((CC_A(),CC_D(_)), _) => 3 
  case CC_E((CC_B(_, _, _),CC_D(_)), _) => 4 
  case CC_E((CC_C(_),CC_D(_)), _) => 5 
}
}
// This is not matched: CC_F(_, _)
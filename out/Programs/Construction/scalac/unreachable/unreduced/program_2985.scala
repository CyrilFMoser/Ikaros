package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[C, C], C]
case class CC_B[D, E]() extends T_A[T_A[D, D], D]
case class CC_C[F, G](a: T_A[T_A[F, F], F]) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}
package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_B[T_A[E], E]
case class CC_C[F](a: T_A[Int]) extends T_B[T_A[F], F]

val v_a: T_B[T_A[Int], Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _, CC_A(_, _, _))) => 1 
}
}
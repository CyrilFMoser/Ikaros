package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, D], c: Boolean) extends T_A[T_A[D, D], D]
case class CC_B[E]() extends T_A[T_A[E, E], E]
case class CC_C[F](a: Char, b: CC_B[F], c: F) extends T_A[T_A[F, F], F]
case class CC_D[G](a: T_B[G]) extends T_B[G]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, 12) => 2 
  case CC_C(_, _, _) => 3 
}
}
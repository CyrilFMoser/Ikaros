package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D, c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_B[Char, F], c: T_A[F]) extends T_A[F]
case class CC_D[G](a: T_A[G]) extends T_B[CC_B[T_A[Char]], G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B()) => 1 
  case CC_A(_, _, CC_C(_, _, _)) => 2 
  case CC_B() => 3 
  case CC_C(_, _, CC_A(_, _, CC_A(_, _, _))) => 4 
  case CC_C(_, _, CC_A(_, _, CC_B())) => 5 
  case CC_C(_, _, CC_A(_, _, CC_C(_, _, _))) => 6 
  case CC_C(_, _, CC_B()) => 7 
  case CC_C(_, _, CC_C(_, _, CC_A(_, _, _))) => 8 
  case CC_C(_, _, CC_C(_, _, CC_B())) => 9 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 10 
}
}
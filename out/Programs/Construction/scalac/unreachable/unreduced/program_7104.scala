package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Char, Char], T_A[T_A[Char, Char], T_A[Char, Char]]], b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C[F](a: F) extends T_A[F, T_A[F, F]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B()) => 1 
  case CC_A(_, _, CC_C(_)) => 2 
  case CC_B() => 3 
  case CC_C(12) => 4 
  case CC_C(_) => 5 
}
}
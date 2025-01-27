package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_A[T_A[F, F], T_A[T_A[F, F], T_A[F, F]]], b: F, c: CC_A[F]) extends T_A[F, T_A[F, F]]
case class CC_C[G]() extends T_A[G, CC_B[T_A[Byte, Char]]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), true, CC_A(true)) => 1 
  case CC_B(CC_A(_), false, CC_A(true)) => 2 
  case CC_B(CC_B(_, _, _), true, CC_A(true)) => 3 
  case CC_B(CC_B(_, _, _), false, CC_A(true)) => 4 
  case CC_B(CC_A(_), true, CC_A(false)) => 5 
  case CC_B(CC_A(_), false, CC_A(false)) => 6 
  case CC_B(CC_B(_, _, _), true, CC_A(false)) => 7 
  case CC_B(CC_B(_, _, _), false, CC_A(false)) => 8 
}
}
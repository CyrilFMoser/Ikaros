package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: Char, b: T_B[E, E], c: T_B[D, D]) extends T_A[D]
case class CC_B[F](a: T_A[F], b: Int) extends T_A[F]
case class CC_C[G](a: CC_B[G], b: T_B[G, Boolean]) extends T_B[G, Boolean]
case class CC_D[H](a: T_B[H, Boolean], b: H, c: T_A[H]) extends T_B[H, Boolean]
case class CC_E[I](a: T_B[I, Boolean], b: T_B[T_A[I], I]) extends T_B[T_B[T_A[Int], Boolean], Boolean]

val v_a: T_B[T_B[T_A[Int], Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), _) => 0 
  case CC_D(CC_C(_, _), _, CC_A(_, _, _)) => 1 
  case CC_D(CC_D(_, _, _), _, CC_A(_, _, _)) => 2 
  case CC_D(CC_E(_, _), _, CC_A(_, _, _)) => 3 
  case CC_D(CC_C(_, _), _, CC_B(_, _)) => 4 
  case CC_D(CC_D(_, _, _), _, CC_B(_, _)) => 5 
  case CC_E(_, _) => 6 
}
}
// This is not matched: CC_D(CC_E(_, _), _, CC_B(_, _))
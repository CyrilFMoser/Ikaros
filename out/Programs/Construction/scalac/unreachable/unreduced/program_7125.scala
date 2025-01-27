package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C[F](a: CC_B[F], b: Char, c: T_A[F]) extends T_A[F]
case class CC_D[G, H](a: T_A[G], b: H) extends T_B[T_A[G], G]
case class CC_E[I](a: CC_A[I], b: I) extends T_B[T_A[I], I]
case class CC_F(a: CC_D[T_A[Char], T_A[Char]], b: CC_C[T_A[Int]]) extends T_B[T_A[T_A[Byte]], T_A[Byte]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), 'x', CC_A(_, _)) => 2 
  case CC_C(CC_B(_), _, CC_A(_, _)) => 3 
  case CC_C(CC_B(_), 'x', CC_B(_)) => 4 
  case CC_C(CC_B(_), _, CC_B(_)) => 5 
  case CC_C(CC_B(_), 'x', CC_C(_, _, _)) => 6 
  case CC_C(CC_B(_), _, CC_C(_, _, _)) => 7 
}
}
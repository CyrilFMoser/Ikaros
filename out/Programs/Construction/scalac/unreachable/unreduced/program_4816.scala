package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[T_B[D, D], D]) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_A[F]
case class CC_D[G](a: G, b: G) extends T_B[T_B[(Int,Char), T_A[Byte]], G]
case class CC_E[H](a: CC_B[H], b: T_A[H]) extends T_B[T_B[(Int,Char), T_A[Byte]], H]
case class CC_F[I](a: CC_B[I], b: T_A[I], c: T_A[I]) extends T_B[T_B[(Int,Char), T_A[Byte]], I]

val v_a: T_B[T_B[(Int,Char), T_A[Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_B(_), CC_A(_)) => 1 
  case CC_E(CC_B(_), CC_B(_)) => 2 
  case CC_E(CC_B(_), CC_C(_)) => 3 
  case CC_F(CC_B(_), CC_A(_), CC_A(_)) => 4 
  case CC_F(CC_B(_), CC_A(_), CC_B(_)) => 5 
  case CC_F(CC_B(_), CC_A(_), CC_C(CC_A(_))) => 6 
  case CC_F(CC_B(_), CC_A(_), CC_C(CC_B(_))) => 7 
  case CC_F(CC_B(_), CC_A(_), CC_C(CC_C(_))) => 8 
  case CC_F(CC_B(_), CC_B(_), CC_A(_)) => 9 
  case CC_F(CC_B(_), CC_B(_), CC_C(CC_A(_))) => 10 
  case CC_F(CC_B(_), CC_B(_), CC_C(CC_B(_))) => 11 
  case CC_F(CC_B(_), CC_B(_), CC_C(CC_C(_))) => 12 
  case CC_F(CC_B(_), CC_C(_), CC_A(_)) => 13 
  case CC_F(CC_B(_), CC_C(_), CC_B(_)) => 14 
  case CC_F(CC_B(_), CC_C(_), CC_C(CC_A(_))) => 15 
  case CC_F(CC_B(_), CC_C(_), CC_C(CC_B(_))) => 16 
  case CC_F(CC_B(_), CC_C(_), CC_C(CC_C(_))) => 17 
}
}
// This is not matched: CC_F(CC_B(_), CC_B(_), CC_B(_))
package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: D) extends T_A[D, T_A[T_A[D, D], D]]
case class CC_B[E]() extends T_A[E, T_A[T_A[E, E], E]]
case class CC_C[F](a: F, b: F, c: T_B[F]) extends T_A[F, T_A[T_A[F, F], F]]
case class CC_D[G](a: CC_B[G], b: (T_B[Boolean],T_B[Byte])) extends T_B[G]
case class CC_E[H](a: T_B[H], b: H, c: T_A[H, H]) extends T_B[H]
case class CC_F[I](a: CC_D[I], b: T_B[I]) extends T_B[I]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), (CC_D(_, _),CC_D(_, _))) => 0 
  case CC_D(CC_B(), (CC_D(_, _),CC_E(_, _, _))) => 1 
  case CC_D(CC_B(), (CC_D(_, _),CC_F(_, _))) => 2 
  case CC_D(CC_B(), (CC_E(_, _, _),CC_D(_, _))) => 3 
  case CC_D(CC_B(), (CC_E(_, _, _),CC_E(_, _, _))) => 4 
  case CC_D(CC_B(), (CC_E(_, _, _),CC_F(_, _))) => 5 
  case CC_D(CC_B(), (CC_F(_, _),CC_D(_, _))) => 6 
  case CC_D(CC_B(), (CC_F(_, _),CC_E(_, _, _))) => 7 
  case CC_D(CC_B(), (CC_F(_, _),CC_F(_, _))) => 8 
  case CC_E(CC_D(_, _), _, _) => 9 
  case CC_E(CC_E(_, _, _), _, _) => 10 
  case CC_E(CC_F(_, CC_D(_, _)), _, _) => 11 
  case CC_E(CC_F(_, CC_E(_, _, _)), _, _) => 12 
  case CC_E(CC_F(_, CC_F(_, _)), _, _) => 13 
  case CC_F(_, CC_D(_, _)) => 14 
  case CC_F(_, CC_E(_, _, _)) => 15 
  case CC_F(_, CC_F(CC_D(_, _), CC_D(_, _))) => 16 
  case CC_F(_, CC_F(CC_D(_, _), CC_E(_, _, _))) => 17 
  case CC_F(_, CC_F(CC_D(_, _), CC_F(_, _))) => 18 
}
}
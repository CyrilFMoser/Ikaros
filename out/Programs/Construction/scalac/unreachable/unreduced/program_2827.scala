package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_A[E], c: Boolean) extends T_A[E]
case class CC_C(a: (((Int,Char),(Int,Byte)),Int), b: CC_A[T_A[Byte]], c: CC_A[CC_A[Boolean]]) extends T_A[CC_A[Byte]]
case class CC_D[F](a: CC_B[F], b: T_A[F]) extends T_B[F, T_A[F]]
case class CC_E[G](a: T_A[G], b: Char) extends T_B[G, T_A[G]]
case class CC_F[H](a: Int, b: H, c: T_B[H, T_A[H]]) extends T_B[H, T_A[H]]

val v_a: T_B[Int, T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _, _), CC_A(_)) => 0 
  case CC_D(CC_B(_, _, _), CC_B(_, _, true)) => 1 
  case CC_D(CC_B(_, _, _), CC_B(_, _, false)) => 2 
  case CC_E(_, _) => 3 
  case CC_F(_, _, _) => 4 
}
}
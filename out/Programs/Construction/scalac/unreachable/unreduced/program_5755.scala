package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: Byte, b: T_A[E, E], c: Byte) extends T_A[E, T_A[E, E]]
case class CC_C(a: CC_A[CC_B[Char]], b: Boolean, c: T_A[Int, T_A[Int, Int]]) extends T_A[T_A[CC_B[Boolean], T_B[Char]], T_A[T_A[CC_B[Boolean], T_B[Char]], T_A[CC_B[Boolean], T_B[Char]]]]
case class CC_D[F](a: T_A[F, T_A[F, F]], b: (CC_A[CC_C],CC_B[Boolean]), c: CC_B[F]) extends T_B[F]
case class CC_E[G](a: T_B[G], b: Int) extends T_B[G]
case class CC_F[H, I](a: T_B[H], b: H, c: CC_C) extends T_B[H]

val v_a: CC_E[CC_C] = null
val v_b: Int = v_a match{
  case CC_E(CC_D(_, _, CC_B(_, _, _)), _) => 0 
  case CC_E(CC_E(CC_D(_, _, _), _), _) => 1 
  case CC_E(CC_E(CC_E(_, _), _), _) => 2 
  case CC_E(CC_E(CC_F(_, _, _), _), _) => 3 
  case CC_E(CC_F(CC_D(_, _, _), _, CC_C(_, _, _)), _) => 4 
  case CC_E(CC_F(CC_E(_, _), _, CC_C(_, _, _)), _) => 5 
  case CC_E(CC_F(CC_F(_, _, _), _, CC_C(_, _, _)), _) => 6 
}
}
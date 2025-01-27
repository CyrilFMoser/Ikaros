package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, T_B[T_A[Byte, Char]]]
case class CC_B[E](a: CC_A[E], b: T_B[E]) extends T_A[E, T_B[T_A[Byte, Char]]]
case class CC_C(a: T_B[CC_A[Int]], b: Boolean, c: CC_B[CC_A[Int]]) extends T_A[Byte, T_B[T_A[Byte, Char]]]
case class CC_D[F]() extends T_B[F]
case class CC_E[G](a: CC_C) extends T_B[G]
case class CC_F[H](a: (CC_D[CC_C],T_B[CC_C]), b: H, c: CC_B[H]) extends T_B[H]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_C(_, true, _)) => 1 
  case CC_E(CC_C(_, false, _)) => 2 
  case CC_F(_, _, CC_B(CC_A(_, _), CC_D())) => 3 
  case CC_F(_, _, CC_B(CC_A(_, _), CC_E(_))) => 4 
  case CC_F(_, _, CC_B(CC_A(_, _), CC_F(_, _, _))) => 5 
}
}
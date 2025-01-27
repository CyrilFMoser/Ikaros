package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Char, c: Boolean) extends T_A[D, T_A[T_B[Int], T_B[Boolean]]]
case class CC_B[E](a: CC_A[E], b: CC_A[E]) extends T_A[E, T_A[T_B[Int], T_B[Boolean]]]
case class CC_C() extends T_A[CC_A[T_A[Int, Boolean]], T_A[T_B[Int], T_B[Boolean]]]
case class CC_D[F](a: F, b: T_A[F, F], c: T_A[F, F]) extends T_B[F]
case class CC_E[G]() extends T_B[G]
case class CC_F[H](a: H) extends T_B[H]

val v_a: T_B[T_A[CC_A[T_A[Int, Boolean]], T_A[T_B[Int], T_B[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
  case CC_F(CC_A(_, _, _)) => 2 
  case CC_F(CC_C()) => 3 
}
}
// This is not matched: CC_F(CC_B(_, CC_A(_, _, _)))
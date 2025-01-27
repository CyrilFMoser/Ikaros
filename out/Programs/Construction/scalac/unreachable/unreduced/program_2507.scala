package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[D]) extends T_A[T_B[T_A[Boolean, Char]], D]
case class CC_B[F](a: T_A[F, F], b: T_B[F]) extends T_A[T_B[T_A[Boolean, Char]], F]
case class CC_C(a: Int) extends T_A[T_B[T_A[Boolean, Char]], T_A[T_B[Boolean], Char]]
case class CC_D[G]() extends T_B[G]
case class CC_E[H](a: T_A[H, H]) extends T_B[H]

val v_a: T_A[T_B[T_A[Boolean, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_A(CC_E(_)) => 1 
  case CC_B(_, _) => 2 
}
}
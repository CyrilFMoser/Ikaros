package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_A[T_B[D], D]) extends T_A[T_B[D], D]
case class CC_B[E](a: T_A[T_B[E], E], b: T_B[E]) extends T_A[T_B[Boolean], Boolean]
case class CC_C[F](a: T_A[F, F]) extends T_B[F]
case class CC_D[G]() extends T_B[G]
case class CC_E(a: T_B[T_A[Char, Boolean]]) extends T_B[(T_B[Char],T_B[Boolean])]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
}
}
package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_B[T_B[Char, E], E], b: T_B[E, D]) extends T_A[D]
case class CC_B[F](a: T_B[F, F], b: T_B[F, F]) extends T_A[F]
case class CC_C(a: Int, b: Boolean, c: T_A[Boolean]) extends T_B[Char, Boolean]
case class CC_D(a: Int) extends T_B[Char, Boolean]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, _)) => 0 
  case CC_C(_, _, CC_B(_, _)) => 1 
  case CC_D(_) => 2 
}
}
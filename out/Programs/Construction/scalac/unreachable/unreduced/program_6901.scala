package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D, E](a: CC_A[D], b: Boolean) extends T_A[D, T_A[D, D]]
case class CC_C[F](a: T_A[F, T_A[F, F]], b: T_A[F, F]) extends T_A[F, T_A[F, F]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(), _) => 2 
  case CC_C(CC_B(_, true), _) => 3 
  case CC_C(CC_B(_, false), _) => 4 
  case CC_C(CC_C(_, _), _) => 5 
}
}
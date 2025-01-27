package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, Boolean]) extends T_A[D, Boolean]
case class CC_B[E](a: T_A[E, E], b: T_A[E, Boolean], c: T_B[E]) extends T_A[E, Boolean]
case class CC_C[F](a: T_A[F, Boolean], b: F) extends T_A[F, Boolean]
case class CC_D() extends T_B[Int]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_)), _) => 0 
  case CC_C(CC_A(CC_B(_, _, _)), _) => 1 
  case CC_C(CC_A(CC_C(_, _)), _) => 2 
  case CC_C(CC_B(_, _, _), _) => 3 
  case CC_C(CC_C(CC_A(_), _), _) => 4 
  case CC_C(CC_C(CC_B(_, _, _), _), _) => 5 
  case CC_C(CC_C(CC_C(_, _), _), _) => 6 
}
}
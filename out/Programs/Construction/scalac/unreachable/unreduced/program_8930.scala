package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_B[C](a: T_B[T_A[C]], b: T_B[T_A[C]]) extends T_B[C]
case class CC_C[D, E](a: T_B[E], b: D) extends T_B[D]
case class CC_D[F](a: F, b: T_B[CC_B[F]], c: F) extends T_B[F]

val v_a: CC_C[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_B(_, _), CC_B(_, _)), _) => 0 
  case CC_C(CC_B(CC_B(_, _), CC_C(_, _)), _) => 1 
  case CC_C(CC_B(CC_B(_, _), CC_D(_, _, _)), _) => 2 
  case CC_C(CC_B(CC_C(_, _), CC_B(_, _)), _) => 3 
  case CC_C(CC_B(CC_C(_, _), CC_C(_, _)), _) => 4 
  case CC_C(CC_B(CC_C(_, _), CC_D(_, _, _)), _) => 5 
  case CC_C(CC_B(CC_D(_, _, _), CC_C(_, _)), _) => 6 
  case CC_C(CC_B(CC_D(_, _, _), CC_D(_, _, _)), _) => 7 
  case CC_C(CC_C(_, _), _) => 8 
  case CC_C(CC_D(_, CC_B(_, _), _), _) => 9 
  case CC_C(CC_D(_, CC_C(_, _), _), _) => 10 
  case CC_C(CC_D(_, CC_D(_, _, _), _), _) => 11 
}
}
// This is not matched: CC_C(CC_B(CC_D(_, _, _), CC_B(_, _)), _)
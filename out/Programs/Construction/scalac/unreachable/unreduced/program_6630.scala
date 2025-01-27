package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_A[D, D]) extends T_A[D, T_B[T_B[Int]]]
case class CC_B[E](a: T_B[E], b: CC_A[E], c: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: F, b: CC_A[F], c: CC_B[F]) extends T_B[F]
case class CC_D[G](a: (T_B[Char],T_B[Boolean])) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_B(_, _, _), _), _) => 0 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_B(_, _, _), _), _) => 1 
  case CC_B(CC_B(CC_D(_), CC_A(_, _, _), _), CC_A(_, CC_B(_, _, _), _), _) => 2 
  case CC_B(CC_C(_, CC_A(_, _, _), CC_B(_, _, _)), CC_A(_, CC_B(_, _, _), _), _) => 3 
  case CC_B(CC_D(_), CC_A(_, CC_B(_, _, _), _), _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_C(_, _, _), _), _) => 5 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_C(_, _, _), _), _) => 6 
  case CC_B(CC_B(CC_D(_), CC_A(_, _, _), _), CC_A(_, CC_C(_, _, _), _), _) => 7 
  case CC_B(CC_C(_, CC_A(_, _, _), CC_B(_, _, _)), CC_A(_, CC_C(_, _, _), _), _) => 8 
  case CC_B(CC_D(_), CC_A(_, CC_C(_, _, _), _), _) => 9 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_D(_), _), _) => 10 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_D(_), _), _) => 11 
  case CC_B(CC_B(CC_D(_), CC_A(_, _, _), _), CC_A(_, CC_D(_), _), _) => 12 
  case CC_B(CC_C(_, CC_A(_, _, _), CC_B(_, _, _)), CC_A(_, CC_D(_), _), _) => 13 
  case CC_B(CC_D(_), CC_A(_, CC_D(_), _), _) => 14 
  case CC_C(_, CC_A(_, _, _), CC_B(CC_B(_, _, _), _, _)) => 15 
  case CC_C(_, CC_A(_, _, _), CC_B(CC_C(_, _, _), _, _)) => 16 
  case CC_C(_, CC_A(_, _, _), CC_B(CC_D(_), _, _)) => 17 
  case CC_D(_) => 18 
}
}
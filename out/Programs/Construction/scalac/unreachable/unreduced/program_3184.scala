package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_B[F, F], b: T_A[F], c: T_A[F]) extends T_A[F]
case class CC_D(a: Int, b: Int, c: CC_A[Byte]) extends T_B[T_A[T_A[Char]], CC_B[T_A[Int]]]
case class CC_E[G](a: (CC_B[CC_D],CC_C[CC_D]), b: (Int,CC_C[CC_D])) extends T_B[T_A[Boolean], G]

val v_a: T_A[T_B[T_A[T_A[Char]], CC_B[T_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_), CC_A(_)) => 2 
  case CC_C(_, CC_B(), CC_A(_)) => 3 
  case CC_C(_, CC_C(_, CC_A(_), _), CC_A(_)) => 4 
  case CC_C(_, CC_C(_, CC_B(), _), CC_A(_)) => 5 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), CC_A(_)) => 6 
  case CC_C(_, CC_A(_), CC_B()) => 7 
  case CC_C(_, CC_B(), CC_B()) => 8 
  case CC_C(_, CC_C(_, CC_A(_), _), CC_B()) => 9 
  case CC_C(_, CC_C(_, CC_B(), _), CC_B()) => 10 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), CC_B()) => 11 
  case CC_C(_, CC_A(_), CC_C(_, _, _)) => 12 
  case CC_C(_, CC_B(), CC_C(_, _, _)) => 13 
  case CC_C(_, CC_C(_, CC_A(_), _), CC_C(_, _, _)) => 14 
  case CC_C(_, CC_C(_, CC_B(), _), CC_C(_, _, _)) => 15 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), CC_C(_, _, _)) => 16 
}
}
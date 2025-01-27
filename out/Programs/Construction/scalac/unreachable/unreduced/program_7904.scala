package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Int], Char], b: Int) extends T_A[T_B[T_B[Char]], T_A[T_B[Boolean], T_A[Byte, Byte]]]
case class CC_B[D, E](a: CC_A, b: T_B[D], c: T_B[D]) extends T_B[D]
case class CC_C[F](a: F, b: CC_A) extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 0 
  case CC_B(CC_A(_, _), CC_B(_, CC_C(_, _), CC_B(_, _, _)), CC_B(_, _, CC_B(_, _, _))) => 1 
  case CC_B(CC_A(_, _), CC_B(_, CC_B(_, _, _), CC_C(_, _)), CC_B(_, _, CC_B(_, _, _))) => 2 
  case CC_B(CC_A(_, _), CC_B(_, CC_C(_, _), CC_C(_, _)), CC_B(_, _, CC_B(_, _, _))) => 3 
  case CC_B(CC_A(_, _), CC_C(_, _), CC_B(_, _, CC_B(_, _, _))) => 4 
  case CC_B(CC_A(_, _), CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, CC_C(_, _))) => 5 
  case CC_B(CC_A(_, _), CC_B(_, CC_C(_, _), CC_B(_, _, _)), CC_B(_, _, CC_C(_, _))) => 6 
  case CC_B(CC_A(_, _), CC_B(_, CC_B(_, _, _), CC_C(_, _)), CC_B(_, _, CC_C(_, _))) => 7 
  case CC_B(CC_A(_, _), CC_B(_, CC_C(_, _), CC_C(_, _)), CC_B(_, _, CC_C(_, _))) => 8 
  case CC_B(CC_A(_, _), CC_C(_, _), CC_B(_, _, CC_C(_, _))) => 9 
  case CC_B(CC_A(_, _), CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_C('x', _)) => 10 
  case CC_B(CC_A(_, _), CC_B(_, CC_C(_, _), CC_B(_, _, _)), CC_C('x', _)) => 11 
  case CC_B(CC_A(_, _), CC_B(_, CC_B(_, _, _), CC_C(_, _)), CC_C('x', _)) => 12 
  case CC_B(CC_A(_, _), CC_B(_, CC_C(_, _), CC_C(_, _)), CC_C('x', _)) => 13 
  case CC_B(CC_A(_, _), CC_C(_, _), CC_C('x', _)) => 14 
  case CC_B(CC_A(_, _), CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_C(_, _)) => 15 
  case CC_B(CC_A(_, _), CC_B(_, CC_C(_, _), CC_B(_, _, _)), CC_C(_, _)) => 16 
  case CC_B(CC_A(_, _), CC_B(_, CC_B(_, _, _), CC_C(_, _)), CC_C(_, _)) => 17 
  case CC_B(CC_A(_, _), CC_B(_, CC_C(_, _), CC_C(_, _)), CC_C(_, _)) => 18 
  case CC_B(CC_A(_, _), CC_C(_, _), CC_C(_, _)) => 19 
  case CC_C(_, _) => 20 
}
}
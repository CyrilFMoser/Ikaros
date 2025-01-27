package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[T_A[D, D], D], c: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: E) extends T_A[E, T_A[T_A[E, E], E]]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_A(_, CC_B(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_A(CC_B(_, _, _), CC_A(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 3 
  case CC_A(CC_A(_, CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 4 
  case CC_A(CC_B(_, _, _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 5 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 6 
  case CC_A(CC_A(_, CC_B(_, _, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 7 
  case CC_A(CC_B(_, _, _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 8 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 9 
  case CC_A(CC_A(_, CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 10 
  case CC_A(CC_B(_, _, _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 11 
  case CC_A(CC_A(_, CC_A(_, _)), CC_B(_, CC_A(_, _), _)) => 12 
  case CC_A(CC_A(_, CC_B(_, _, _)), CC_B(_, CC_A(_, _), _)) => 13 
  case CC_A(CC_B(_, _, _), CC_B(_, CC_A(_, _), _)) => 14 
  case CC_A(CC_A(_, CC_A(_, _)), CC_B(_, CC_B(_, _, _), _)) => 15 
  case CC_A(CC_A(_, CC_B(_, _, _)), CC_B(_, CC_B(_, _, _), _)) => 16 
  case CC_A(CC_B(_, _, _), CC_B(_, CC_B(_, _, _), _)) => 17 
  case CC_B(_, _, _) => 18 
}
}
package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, Boolean]], b: T_A[C, Boolean], c: C) extends T_A[C, Boolean]
case class CC_B[D](a: T_A[(Int,Char), Boolean], b: Int, c: CC_A[D]) extends T_A[D, Boolean]
case class CC_C(a: T_A[T_A[Boolean, Boolean], Boolean], b: CC_B[CC_A[Char]], c: CC_B[(Byte,Boolean)]) extends T_A[T_A[T_A[Char, Boolean], Boolean], Boolean]

val v_a: T_A[T_A[T_A[Char, Boolean], Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 1 
  case CC_A(_, CC_A(_, _, _), CC_B(CC_B(_, _, _), _, CC_A(_, _, _))) => 2 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), CC_A(_, _, _)) => 3 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 4 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), CC_B(CC_B(_, _, _), _, CC_A(_, _, _))) => 5 
  case CC_A(_, CC_C(_, CC_B(_, _, _), _), CC_A(_, _, _)) => 6 
  case CC_A(_, CC_C(_, CC_B(_, _, _), _), CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 7 
  case CC_A(_, CC_C(_, CC_B(_, _, _), _), CC_B(CC_B(_, _, _), _, CC_A(_, _, _))) => 8 
  case CC_B(_, _, _) => 9 
  case CC_C(_, _, _) => 10 
}
}
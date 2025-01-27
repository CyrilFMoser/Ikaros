package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[Int, T_A[Byte, Byte]], T_A[T_A[Int, T_A[Byte, Byte]], T_A[Int, T_A[Byte, Byte]]]], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: T_A[E, E], b: T_A[E, T_A[E, E]], c: CC_A[T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A('x', _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
  case CC_A('x', _, CC_B(_, CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_A(_, _, CC_B(_, CC_A(_, _, _), CC_A(_, _, _))) => 3 
  case CC_A('x', _, CC_B(_, CC_B(_, _, _), CC_A(_, _, _))) => 4 
  case CC_A(_, _, CC_B(_, CC_B(_, _, _), CC_A(_, _, _))) => 5 
  case CC_B(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 6 
  case CC_B(_, CC_A(_, CC_A(_, _, _), CC_B(_, _, _)), _) => 7 
  case CC_B(_, CC_A(_, CC_B(_, _, _), CC_A(_, _, _)), _) => 8 
  case CC_B(_, CC_A(_, CC_B(_, _, _), CC_B(_, _, _)), _) => 9 
  case CC_B(_, CC_B(_, _, _), _) => 10 
}
}
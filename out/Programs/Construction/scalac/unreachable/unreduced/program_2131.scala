package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B[D](a: (Char,T_A[Boolean, Boolean]), b: T_A[D, Boolean], c: T_A[T_A[D, Boolean], Boolean]) extends T_A[D, Boolean]
case class CC_C[E](a: CC_B[E]) extends T_A[E, Boolean]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(CC_A(_, _), _), CC_A(_, _)) => 1 
  case CC_B(_, CC_A(CC_C(_), _), CC_A(_, _)) => 2 
  case CC_B(_, CC_B(_, _, _), CC_A(_, _)) => 3 
  case CC_B(_, CC_C(CC_B(_, _, _)), CC_A(_, _)) => 4 
  case CC_B(_, CC_A(CC_A(_, _), _), CC_B((_,_), _, _)) => 5 
  case CC_B(_, CC_A(CC_B(_, _, _), _), CC_B((_,_), _, _)) => 6 
  case CC_B(_, CC_A(CC_C(_), _), CC_B((_,_), _, _)) => 7 
  case CC_B(_, CC_B(_, _, _), CC_B((_,_), _, _)) => 8 
  case CC_B(_, CC_C(CC_B(_, _, _)), CC_B((_,_), _, _)) => 9 
  case CC_B(_, CC_A(CC_A(_, _), _), CC_C(CC_B(_, _, _))) => 10 
  case CC_B(_, CC_A(CC_B(_, _, _), _), CC_C(CC_B(_, _, _))) => 11 
  case CC_B(_, CC_A(CC_C(_), _), CC_C(CC_B(_, _, _))) => 12 
  case CC_B(_, CC_B(_, _, _), CC_C(CC_B(_, _, _))) => 13 
  case CC_B(_, CC_C(CC_B(_, _, _)), CC_C(CC_B(_, _, _))) => 14 
  case CC_C(CC_B(_, _, _)) => 15 
}
}
// This is not matched: CC_B(_, CC_A(CC_B(_, _, _), _), CC_A(_, _))
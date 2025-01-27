package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, T_B], c: T_B) extends T_A[C, T_B]
case class CC_B[D](a: (CC_A[T_B],Boolean), b: CC_A[D], c: T_A[D, D]) extends T_A[D, T_B]
case class CC_C(a: T_A[CC_B[T_B], T_B], b: T_A[CC_B[T_B], T_B], c: CC_A[T_A[(Byte,Byte), T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), CC_A(CC_B(_, _, _), _, CC_C(_, _, _)), CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_C(CC_B((_,_), CC_A(_, _, _), _), CC_A(CC_B(_, _, _), _, CC_C(_, _, _)), CC_A(CC_A(_, _, _), _, _)) => 1 
  case CC_C(CC_A(_, _, _), CC_B(_, CC_A(_, _, _), _), CC_A(CC_A(_, _, _), _, _)) => 2 
  case CC_C(CC_B((_,_), CC_A(_, _, _), _), CC_B(_, CC_A(_, _, _), _), CC_A(CC_A(_, _, _), _, _)) => 3 
  case CC_C(CC_A(_, _, _), CC_A(CC_B(_, _, _), _, CC_C(_, _, _)), CC_A(CC_B(_, _, _), _, _)) => 4 
  case CC_C(CC_B((_,_), CC_A(_, _, _), _), CC_A(CC_B(_, _, _), _, CC_C(_, _, _)), CC_A(CC_B(_, _, _), _, _)) => 5 
  case CC_C(CC_B((_,_), CC_A(_, _, _), _), CC_B(_, CC_A(_, _, _), _), CC_A(CC_B(_, _, _), _, _)) => 6 
}
}
// This is not matched: CC_C(CC_A(_, _, _), CC_B(_, CC_A(_, _, _), _), CC_A(CC_B(_, _, _), _, _))
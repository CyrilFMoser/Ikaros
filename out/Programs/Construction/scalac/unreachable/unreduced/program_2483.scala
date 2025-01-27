package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C, c: T_A[C]) extends T_A[C]
case class CC_B[D](a: Boolean) extends T_A[D]
case class CC_C(a: T_A[T_A[Boolean]], b: T_B[T_A[(Char,Int)]], c: T_B[Boolean]) extends T_B[CC_A[Char]]
case class CC_D(a: T_A[CC_B[CC_C]], b: T_B[CC_A[Char]]) extends T_B[CC_A[Char]]
case class CC_E() extends T_B[((CC_C,CC_D),Char)]

val v_a: CC_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_, _, _), CC_A(_, _, _)), _, CC_A(_, CC_C(_, _, _), _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_, _, _), CC_A(_, _, _)), _, CC_B(_)) => 1 
  case CC_A(CC_A(CC_B(_), CC_C(_, _, _), CC_A(_, _, _)), _, CC_A(_, CC_C(_, _, _), _)) => 2 
  case CC_A(CC_A(CC_B(_), CC_C(_, _, _), CC_A(_, _, _)), _, CC_B(_)) => 3 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_, _, _), CC_B(_)), _, CC_A(_, CC_C(_, _, _), _)) => 4 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_, _, _), CC_B(_)), _, CC_B(_)) => 5 
  case CC_A(CC_A(CC_B(_), CC_C(_, _, _), CC_B(_)), _, CC_A(_, CC_C(_, _, _), _)) => 6 
  case CC_A(CC_A(CC_B(_), CC_C(_, _, _), CC_B(_)), _, CC_B(_)) => 7 
  case CC_A(CC_B(true), _, CC_A(_, CC_C(_, _, _), _)) => 8 
  case CC_A(CC_B(true), _, CC_B(_)) => 9 
  case CC_A(CC_B(false), _, CC_A(_, CC_C(_, _, _), _)) => 10 
  case CC_A(CC_B(false), _, CC_B(_)) => 11 
}
}
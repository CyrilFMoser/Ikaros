package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Byte, c: T_A[B]) extends T_A[B]
case class CC_B[C](a: T_A[C], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_C(a: T_A[CC_B[Byte]], b: T_A[T_A[Int]], c: T_A[T_A[Byte]]) extends T_A[T_A[(Byte,Char)]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_B(_, CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), CC_A(_, _, _)) => 1 
  case CC_B(_, CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), CC_A(_, _, _)) => 2 
  case CC_B(_, CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), CC_A(_, _, _)) => 3 
  case CC_B(_, CC_B(_, _, _), CC_A(_, _, _)) => 4 
  case CC_B(_, CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), CC_B(_, _, _)) => 5 
  case CC_B(_, CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), CC_B(_, _, _)) => 6 
  case CC_B(_, CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), CC_B(_, _, _)) => 7 
  case CC_B(_, CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), CC_B(_, _, _)) => 8 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 9 
}
}
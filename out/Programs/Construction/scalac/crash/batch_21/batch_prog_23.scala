package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Int]], c: Char) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[CC_A]], b: (CC_A,T_A[CC_A]), c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_C[B](a: Byte, b: CC_A, c: CC_B) extends T_A[B]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(CC_C(_, _, _), _, _)) => 0 
  case CC_C(_, CC_A(CC_B(_, _, _), CC_A(_, _, _), _), CC_B(CC_C(_, _, _), _, _)) => 1 
  case CC_C(_, CC_A(CC_C(_, _, _), CC_A(_, _, _), _), CC_B(CC_C(_, _, _), _, _)) => 2 
  case CC_C(_, CC_A(CC_A(_, _, _), CC_B(_, _, _), _), CC_B(CC_C(_, _, _), _, _)) => 3 
  case CC_C(_, CC_A(CC_B(_, _, _), CC_B(_, _, _), _), CC_B(CC_C(_, _, _), _, _)) => 4 
  case CC_C(_, CC_A(CC_C(_, _, _), CC_B(_, _, _), _), CC_B(CC_C(_, _, _), _, _)) => 5 
  case CC_C(_, CC_A(CC_A(_, _, _), CC_C(_, _, _), _), CC_B(CC_C(_, _, _), _, _)) => 6 
  case CC_C(_, CC_A(CC_B(_, _, _), CC_C(_, _, _), _), CC_B(CC_C(_, _, _), _, _)) => 7 
  case CC_C(_, CC_A(CC_C(_, _, _), CC_C(_, _, _), _), CC_B(CC_C(_, _, _), _, _)) => 8 
}
}
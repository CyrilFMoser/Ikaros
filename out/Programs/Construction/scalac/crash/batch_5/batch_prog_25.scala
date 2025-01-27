package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Int, b: T_A[B], c: Int) extends T_A[B]
case class CC_B[C, D](a: D) extends T_A[C]
case class CC_C(a: T_A[T_A[Byte]], b: T_A[T_A[Byte]], c: CC_A[T_A[Int]]) extends T_A[T_A[CC_B[Byte, (Int,Int)]]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_A(_, _, _), _), CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _)) => 0 
  case CC_C(CC_A(_, CC_B(_), _), CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _)) => 1 
  case CC_C(CC_B(_), CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _)) => 2 
  case CC_C(CC_A(_, CC_A(_, _, _), _), CC_B(_), CC_A(_, CC_A(_, _, _), _)) => 3 
  case CC_C(CC_A(_, CC_B(_), _), CC_B(_), CC_A(_, CC_A(_, _, _), _)) => 4 
  case CC_C(CC_B(_), CC_B(_), CC_A(_, CC_A(_, _, _), _)) => 5 
  case CC_C(CC_A(_, CC_A(_, _, _), _), CC_A(_, _, _), CC_A(_, CC_B(_), _)) => 6 
  case CC_C(CC_A(_, CC_B(_), _), CC_A(_, _, _), CC_A(_, CC_B(_), _)) => 7 
  case CC_C(CC_B(_), CC_A(_, _, _), CC_A(_, CC_B(_), _)) => 8 
  case CC_C(CC_A(_, CC_A(_, _, _), _), CC_B(_), CC_A(_, CC_B(_), _)) => 9 
  case CC_C(CC_A(_, CC_B(_), _), CC_B(_), CC_A(_, CC_B(_), _)) => 10 
  case CC_C(CC_B(_), CC_B(_), CC_A(_, CC_B(_), _)) => 11 
}
}
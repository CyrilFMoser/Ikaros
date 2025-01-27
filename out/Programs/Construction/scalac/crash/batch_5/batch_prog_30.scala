package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[Int]) extends T_A[B]
case class CC_B[C](a: Int, b: T_A[C], c: T_A[T_A[C]]) extends T_A[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, CC_A(_), CC_A(_))) => 2 
  case CC_A(CC_B(_, CC_A(_), CC_B(_, _, _))) => 3 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_A(_))) => 4 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_B(_, _, _))) => 5 
  case CC_B(_, CC_A(_), CC_A(CC_A(_))) => 6 
  case CC_B(_, CC_B(_, _, _), CC_A(CC_A(_))) => 7 
  case CC_B(_, CC_A(_), CC_A(CC_B(_, _, _))) => 8 
  case CC_B(_, CC_B(_, _, _), CC_A(CC_B(_, _, _))) => 9 
  case CC_B(_, CC_A(_), CC_B(_, _, _)) => 10 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 11 
}
}
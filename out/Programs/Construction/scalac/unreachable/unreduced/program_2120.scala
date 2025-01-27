package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[T_A[Int]], c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B() extends T_A[T_A[Int]]
case class CC_C(a: CC_B, b: T_A[CC_A], c: T_A[T_A[Int]]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_A(_, CC_C(CC_B(), _, CC_A(_, _, _)), _) => 2 
  case CC_A(_, CC_C(CC_B(), _, CC_B()), _) => 3 
  case CC_A(_, CC_C(CC_B(), _, CC_C(_, _, _)), _) => 4 
  case CC_B() => 5 
  case CC_C(_, _, CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 6 
  case CC_C(_, _, CC_A(_, CC_A(_, _, _), CC_B())) => 7 
  case CC_C(_, _, CC_A(_, CC_A(_, _, _), CC_C(_, _, _))) => 8 
  case CC_C(_, _, CC_A(_, CC_B(), CC_A(_, _, _))) => 9 
  case CC_C(_, _, CC_A(_, CC_B(), CC_B())) => 10 
  case CC_C(_, _, CC_A(_, CC_B(), CC_C(_, _, _))) => 11 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_A(_, _, _))) => 12 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_B())) => 13 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_C(_, _, _))) => 14 
  case CC_C(_, _, CC_B()) => 15 
  case CC_C(_, _, CC_C(CC_B(), _, _)) => 16 
}
}
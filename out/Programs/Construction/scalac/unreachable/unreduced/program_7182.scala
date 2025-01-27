package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[T_A[Int]], c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B() extends T_A[T_A[Int]]
case class CC_C(a: T_A[T_A[Int]], b: CC_B) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_A(_, CC_C(_, CC_B()), _) => 2 
  case CC_B() => 3 
  case CC_C(CC_A(_, CC_A(_, _, _), _), _) => 4 
  case CC_C(CC_A(_, CC_B(), _), _) => 5 
  case CC_C(CC_A(_, CC_C(_, _), _), _) => 6 
  case CC_C(CC_B(), _) => 7 
  case CC_C(CC_C(CC_A(_, _, _), CC_B()), _) => 8 
  case CC_C(CC_C(CC_B(), CC_B()), _) => 9 
  case CC_C(CC_C(CC_C(_, _), CC_B()), _) => 10 
}
}
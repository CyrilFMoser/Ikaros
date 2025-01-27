package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Char]], c: T_A[T_A[Int]]) extends T_A[T_A[Char]]
case class CC_B() extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 0 
  case CC_A(CC_B(), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 1 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_B(), _), _) => 2 
  case CC_A(CC_B(), CC_A(CC_A(_, _, _), CC_B(), _), _) => 3 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(), CC_A(_, _, _), _), _) => 4 
  case CC_A(CC_B(), CC_A(CC_B(), CC_A(_, _, _), _), _) => 5 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(), CC_B(), _), _) => 6 
  case CC_A(CC_B(), CC_A(CC_B(), CC_B(), _), _) => 7 
  case CC_A(CC_B(), CC_B(), _) => 8 
  case CC_B() => 9 
}
}
// This is not matched: CC_A(CC_A(_, _, _), CC_B(), _)
package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[T_A[Boolean]]) extends T_A[Int]
case class CC_B(a: T_A[Int], b: T_A[Int]) extends T_A[Int]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_B(CC_B(CC_A(_, _), _), CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_B(_, _), _), CC_A(_, _)) => 2 
  case CC_B(CC_A(_, _), CC_B(CC_A(_, _), _)) => 3 
  case CC_B(CC_B(CC_A(_, _), _), CC_B(CC_A(_, _), _)) => 4 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_A(_, _), _)) => 5 
  case CC_B(CC_A(_, _), CC_B(CC_B(_, _), _)) => 6 
  case CC_B(CC_B(CC_A(_, _), _), CC_B(CC_B(_, _), _)) => 7 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), _)) => 8 
}
}
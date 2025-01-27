package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[Int]) extends T_A[Int]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[CC_A]]) extends T_A[Int]
case class CC_C(a: CC_B, b: CC_A, c: Boolean) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _)), _) => 1 
  case CC_A(CC_A(CC_C(_, _, _), CC_A(_, _)), _) => 2 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _, _)), _) => 3 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _)), _) => 4 
  case CC_A(CC_A(CC_C(_, _, _), CC_B(_, _, _)), _) => 5 
  case CC_A(CC_A(CC_A(_, _), CC_C(_, _, _)), _) => 6 
  case CC_A(CC_A(CC_B(_, _, _), CC_C(_, _, _)), _) => 7 
  case CC_A(CC_A(CC_C(_, _, _), CC_C(_, _, _)), _) => 8 
  case CC_A(CC_B(_, CC_A(_, _), _), _) => 9 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), _), _) => 10 
  case CC_B(CC_A(CC_A(_, _), CC_A(_, _)), _, _) => 11 
  case CC_B(CC_A(CC_A(_, _), CC_B(_, _, _)), _, _) => 12 
  case CC_B(CC_A(CC_A(_, _), CC_C(_, _, _)), _, _) => 13 
  case CC_B(CC_A(CC_B(_, _, _), CC_A(_, _)), _, _) => 14 
  case CC_B(CC_A(CC_B(_, _, _), CC_B(_, _, _)), _, _) => 15 
  case CC_B(CC_A(CC_B(_, _, _), CC_C(_, _, _)), _, _) => 16 
  case CC_B(CC_A(CC_C(_, _, _), CC_A(_, _)), _, _) => 17 
  case CC_B(CC_A(CC_C(_, _, _), CC_B(_, _, _)), _, _) => 18 
  case CC_B(CC_A(CC_C(_, _, _), CC_C(_, _, _)), _, _) => 19 
  case CC_C(_, _, _) => 20 
}
}
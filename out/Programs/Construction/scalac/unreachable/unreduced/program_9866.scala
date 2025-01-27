package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[Int, C]
case class CC_B[D](a: T_A[Int, D], b: T_A[Int, D]) extends T_A[Int, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_B(CC_A(_), CC_B(_, _)) => 2 
  case CC_B(CC_B(CC_A(_), CC_A(_)), CC_A(_)) => 3 
  case CC_B(CC_B(CC_A(_), CC_A(_)), CC_B(_, _)) => 4 
  case CC_B(CC_B(CC_B(_, _), CC_A(_)), CC_A(_)) => 5 
  case CC_B(CC_B(CC_B(_, _), CC_A(_)), CC_B(_, _)) => 6 
  case CC_B(CC_B(CC_A(_), CC_B(_, _)), CC_A(_)) => 7 
  case CC_B(CC_B(CC_A(_), CC_B(_, _)), CC_B(_, _)) => 8 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), CC_A(_)) => 9 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), CC_B(_, _)) => 10 
}
}
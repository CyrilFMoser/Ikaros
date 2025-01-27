package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B[C](a: T_A[C], b: T_A[C], c: T_A[C]) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), CC_A(CC_A(_)), _) => 0 
  case CC_B(CC_B(_, _, _), CC_A(CC_A(_)), _) => 1 
  case CC_B(CC_A(_), CC_A(CC_B(_, _, _)), _) => 2 
  case CC_B(CC_B(_, _, _), CC_A(CC_B(_, _, _)), _) => 3 
  case CC_B(CC_A(_), CC_B(CC_A(_), CC_A(_), CC_A(_)), _) => 4 
  case CC_B(CC_B(_, _, _), CC_B(CC_A(_), CC_A(_), CC_A(_)), _) => 5 
  case CC_B(CC_A(_), CC_B(CC_A(_), CC_B(_, _, _), CC_A(_)), _) => 6 
  case CC_B(CC_B(_, _, _), CC_B(CC_A(_), CC_B(_, _, _), CC_A(_)), _) => 7 
  case CC_B(CC_A(_), CC_B(CC_A(_), CC_A(_), CC_B(_, _, _)), _) => 8 
  case CC_B(CC_B(_, _, _), CC_B(CC_A(_), CC_A(_), CC_B(_, _, _)), _) => 9 
  case CC_B(CC_A(_), CC_B(CC_A(_), CC_B(_, _, _), CC_B(_, _, _)), _) => 10 
  case CC_B(CC_B(_, _, _), CC_B(CC_A(_), CC_B(_, _, _), CC_B(_, _, _)), _) => 11 
  case CC_B(CC_A(_), CC_B(CC_B(_, _, _), CC_A(_), CC_A(_)), _) => 12 
  case CC_B(CC_B(_, _, _), CC_B(CC_B(_, _, _), CC_A(_), CC_A(_)), _) => 13 
  case CC_B(CC_A(_), CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_A(_)), _) => 14 
  case CC_B(CC_B(_, _, _), CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_A(_)), _) => 15 
  case CC_B(CC_A(_), CC_B(CC_B(_, _, _), CC_A(_), CC_B(_, _, _)), _) => 16 
  case CC_B(CC_B(_, _, _), CC_B(CC_B(_, _, _), CC_A(_), CC_B(_, _, _)), _) => 17 
  case CC_B(CC_A(_), CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _)), _) => 18 
  case CC_B(CC_B(_, _, _), CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _)), _) => 19 
}
}
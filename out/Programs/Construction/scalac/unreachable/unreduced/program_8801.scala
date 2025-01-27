package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[Char]
case class CC_B(a: T_A[Char], b: CC_A, c: Boolean) extends T_A[Char]
case class CC_C(a: Byte, b: CC_B, c: T_A[CC_A]) extends T_A[Char]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_)), CC_A(CC_A(_)), _) => 0 
  case CC_B(CC_A(CC_B(_, _, _)), CC_A(CC_A(_)), _) => 1 
  case CC_B(CC_A(CC_C(_, _, _)), CC_A(CC_A(_)), _) => 2 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), CC_A(CC_A(_)), _) => 3 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), CC_A(CC_A(_)), _) => 4 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(_), _), CC_A(CC_A(_)), _) => 5 
  case CC_B(CC_C(_, _, _), CC_A(CC_A(_)), _) => 6 
  case CC_B(CC_A(CC_A(_)), CC_A(CC_B(_, _, _)), _) => 7 
  case CC_B(CC_A(CC_B(_, _, _)), CC_A(CC_B(_, _, _)), _) => 8 
  case CC_B(CC_A(CC_C(_, _, _)), CC_A(CC_B(_, _, _)), _) => 9 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), CC_A(CC_B(_, _, _)), _) => 10 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), CC_A(CC_B(_, _, _)), _) => 11 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(_), _), CC_A(CC_B(_, _, _)), _) => 12 
  case CC_B(CC_C(_, _, _), CC_A(CC_B(_, _, _)), _) => 13 
  case CC_B(CC_A(CC_A(_)), CC_A(CC_C(_, _, _)), _) => 14 
  case CC_B(CC_A(CC_B(_, _, _)), CC_A(CC_C(_, _, _)), _) => 15 
  case CC_B(CC_A(CC_C(_, _, _)), CC_A(CC_C(_, _, _)), _) => 16 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), CC_A(CC_C(_, _, _)), _) => 17 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), CC_A(CC_C(_, _, _)), _) => 18 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(_), _), CC_A(CC_C(_, _, _)), _) => 19 
  case CC_B(CC_C(_, _, _), CC_A(CC_C(_, _, _)), _) => 20 
}
}
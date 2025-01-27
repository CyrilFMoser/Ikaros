package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int) extends T_A
case class CC_B[C](a: T_B[C, C], b: T_A, c: C) extends T_A
case class CC_C(a: CC_B[Char], b: CC_A) extends T_A
case class CC_D[D](a: D, b: T_B[D, D]) extends T_B[CC_C, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_B(_, CC_B(_, CC_A(_), _), _) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 3 
  case CC_B(_, CC_B(_, CC_C(_, _), _), _) => 4 
  case CC_B(_, CC_C(CC_B(_, _, _), CC_A(_)), _) => 5 
  case CC_C(_, CC_A(12)) => 6 
  case CC_C(_, CC_A(_)) => 7 
}
}
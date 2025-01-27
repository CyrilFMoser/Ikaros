package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[(T_A,T_A), T_B[T_A, Char]]) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A, CC_A], c: Int) extends T_A
case class CC_C(a: T_A, b: CC_A, c: Char) extends T_A
case class CC_D[C](a: CC_B, b: C, c: T_B[C, C]) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(CC_A(_, _), _, _), _) => 1 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), 'x'), _) => 2 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _), _), _) => 3 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), 'x'), _) => 4 
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _), _), _) => 5 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), 'x'), _) => 6 
  case CC_A(CC_C(CC_C(_, _, _), CC_A(_, _), _), _) => 7 
  case CC_B(_, _, _) => 8 
  case CC_C(_, CC_A(_, _), _) => 9 
}
}
package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: T_B[T_A, Char]) extends T_A
case class CC_B(a: T_A, b: T_A, c: Int) extends T_A
case class CC_C(a: Char, b: CC_A) extends T_A
case class CC_D[C](a: C) extends T_B[CC_A, C]
case class CC_E[D]() extends T_B[CC_A, D]
case class CC_F[E]() extends T_B[CC_A, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, _) => 1 
  case CC_B(CC_B(CC_A(_, _), CC_A(_, _), _), _, _) => 2 
  case CC_B(CC_B(CC_A(_, _), CC_B(_, _, _), _), _, _) => 3 
  case CC_B(CC_B(CC_A(_, _), CC_C(_, _), _), _, _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_, _), _), _, _) => 5 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _, _) => 6 
  case CC_B(CC_B(CC_C(_, _), CC_A(_, _), _), _, _) => 7 
  case CC_B(CC_B(CC_C(_, _), CC_B(_, _, _), _), _, _) => 8 
  case CC_B(CC_B(CC_C(_, _), CC_C(_, _), _), _, _) => 9 
  case CC_B(CC_C(_, CC_A(_, _)), _, _) => 10 
  case CC_C(_, _) => 11 
}
}
// This is not matched: CC_B(CC_B(CC_B(_, _, _), CC_C(_, _), _), _, _)
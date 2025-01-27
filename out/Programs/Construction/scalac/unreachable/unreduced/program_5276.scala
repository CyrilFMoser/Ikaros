package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Char, T_A], Int], b: T_A, c: T_A) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[C](a: (Int,T_B[CC_B, T_A])) extends T_B[C, T_A]
case class CC_E[D]() extends T_B[D, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, CC_A(_, _, _)), _) => 1 
  case CC_B(CC_A(_, _, CC_B(_, _)), _) => 2 
  case CC_B(CC_A(_, _, CC_C(_)), _) => 3 
  case CC_B(CC_B(CC_A(_, _, _), CC_A(_, _, _)), _) => 4 
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _, _)), _) => 5 
  case CC_B(CC_B(CC_C(_), CC_A(_, _, _)), _) => 6 
  case CC_B(CC_B(CC_A(_, _, _), CC_B(_, _)), _) => 7 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), _) => 8 
  case CC_B(CC_B(CC_C(_), CC_B(_, _)), _) => 9 
  case CC_B(CC_B(CC_A(_, _, _), CC_C(_)), _) => 10 
  case CC_B(CC_B(CC_B(_, _), CC_C(_)), _) => 11 
  case CC_B(CC_C(CC_A(_, _, _)), _) => 12 
  case CC_C(CC_A(_, CC_A(_, _, _), _)) => 13 
  case CC_C(CC_A(_, CC_B(_, _), _)) => 14 
  case CC_C(CC_A(_, CC_C(_), _)) => 15 
}
}
// This is not matched: CC_B(CC_B(CC_C(_), CC_C(_)), _)
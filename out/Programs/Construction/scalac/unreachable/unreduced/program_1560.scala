package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_B(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_C(a: CC_B, b: T_B[T_B[CC_A, CC_A], CC_B]) extends T_A
case class CC_D[C]() extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
  case CC_B(_, CC_B(_, _, _), CC_A(_)) => 2 
  case CC_B(_, CC_C(_, _), CC_A(_)) => 3 
  case CC_B(_, CC_A(_), CC_B(_, _, _)) => 4 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 5 
  case CC_B(_, CC_C(_, _), CC_B(_, _, _)) => 6 
  case CC_B(_, CC_A(_), CC_C(_, _)) => 7 
  case CC_B(_, CC_C(_, _), CC_C(_, _)) => 8 
  case CC_C(_, _) => 9 
}
}
// This is not matched: CC_B(_, CC_B(_, _, _), CC_C(_, _))
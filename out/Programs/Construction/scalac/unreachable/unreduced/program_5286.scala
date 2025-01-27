package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: CC_A, b: Int, c: T_B[(CC_A,T_A), CC_A]) extends T_A
case class CC_C(a: Int, b: T_B[Char, CC_A]) extends T_A
case class CC_D[C](a: C, b: T_A, c: CC_C) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(12, CC_D(_, CC_A(_), _)) => 1 
  case CC_C(12, CC_D(_, CC_B(_, _, _), _)) => 2 
  case CC_C(12, CC_D(_, CC_C(_, _), _)) => 3 
  case CC_C(_, CC_D(_, CC_A(_), _)) => 4 
  case CC_C(_, CC_D(_, CC_B(_, _, _), _)) => 5 
  case CC_C(_, CC_D(_, CC_C(_, _), _)) => 6 
}
}
// This is not matched: CC_B(_, _, _)
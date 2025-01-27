package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, Boolean], T_A[(Char,Int)]]) extends T_A[T_B[Byte, Char]]
case class CC_B(a: T_A[T_B[Byte, Char]], b: T_A[CC_A]) extends T_A[T_B[Byte, Char]]
case class CC_C(a: Char, b: T_A[T_B[Byte, Char]]) extends T_A[T_B[Byte, Char]]

val v_a: T_A[T_B[Byte, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C('x', CC_A(_)) => 2 
  case CC_C('x', CC_B(CC_A(_), _)) => 3 
  case CC_C('x', CC_B(CC_B(_, _), _)) => 4 
  case CC_C('x', CC_B(CC_C(_, _), _)) => 5 
  case CC_C('x', CC_C(_, CC_A(_))) => 6 
  case CC_C('x', CC_C(_, CC_B(_, _))) => 7 
  case CC_C('x', CC_C(_, CC_C(_, _))) => 8 
  case CC_C(_, CC_A(_)) => 9 
  case CC_C(_, CC_B(CC_B(_, _), _)) => 10 
  case CC_C(_, CC_B(CC_C(_, _), _)) => 11 
  case CC_C(_, CC_C(_, CC_A(_))) => 12 
  case CC_C(_, CC_C(_, CC_B(_, _))) => 13 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 14 
}
}
// This is not matched: CC_C(_, CC_B(CC_A(_), _))
package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Byte,Boolean)]], b: T_A[T_A[Char]], c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_C(a: CC_B, b: CC_B) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, CC_A(_, _, _), _)) => 1 
  case CC_B(CC_A(_, CC_C(_, _), _)) => 2 
  case CC_B(CC_B(CC_A(_, _, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
  case CC_B(CC_B(CC_C(_, _))) => 5 
  case CC_B(CC_C(CC_B(_), _)) => 6 
  case CC_C(CC_B(CC_A(_, _, _)), _) => 7 
  case CC_C(CC_B(CC_B(_)), _) => 8 
  case CC_C(CC_B(CC_C(_, _)), _) => 9 
}
}
// This is not matched: CC_B(CC_A(_, CC_B(_), _))
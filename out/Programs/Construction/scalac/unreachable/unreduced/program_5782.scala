package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[Char], c: T_A[Char]) extends T_A[Char]
case class CC_B(a: CC_A, b: T_A[Char]) extends T_A[Char]
case class CC_C(a: Byte) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), _) => 0 
  case CC_A(_, CC_A(_, _, CC_B(_, _)), _) => 1 
  case CC_A(_, CC_A(_, _, CC_C(_)), _) => 2 
  case CC_A(_, CC_B(_, _), _) => 3 
  case CC_A(_, CC_C(_), _) => 4 
  case CC_B(CC_A(_, CC_A(_, _, _), _), CC_A(_, _, _)) => 5 
  case CC_B(CC_A(_, CC_A(_, _, _), _), CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 6 
  case CC_B(CC_A(_, CC_A(_, _, _), _), CC_B(CC_A(_, _, _), CC_B(_, _))) => 7 
  case CC_B(CC_A(_, CC_A(_, _, _), _), CC_B(CC_A(_, _, _), CC_C(_))) => 8 
  case CC_B(CC_A(_, CC_A(_, _, _), _), CC_C(_)) => 9 
  case CC_B(CC_A(_, CC_B(_, _), _), CC_A(_, _, _)) => 10 
  case CC_B(CC_A(_, CC_B(_, _), _), CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 11 
  case CC_B(CC_A(_, CC_B(_, _), _), CC_B(CC_A(_, _, _), CC_B(_, _))) => 12 
  case CC_B(CC_A(_, CC_B(_, _), _), CC_B(CC_A(_, _, _), CC_C(_))) => 13 
  case CC_B(CC_A(_, CC_B(_, _), _), CC_C(_)) => 14 
  case CC_B(CC_A(_, CC_C(_), _), CC_A(_, _, _)) => 15 
  case CC_B(CC_A(_, CC_C(_), _), CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 16 
  case CC_B(CC_A(_, CC_C(_), _), CC_B(CC_A(_, _, _), CC_B(_, _))) => 17 
  case CC_B(CC_A(_, CC_C(_), _), CC_B(CC_A(_, _, _), CC_C(_))) => 18 
  case CC_B(CC_A(_, CC_C(_), _), CC_C(_)) => 19 
  case CC_C(_) => 20 
}
}
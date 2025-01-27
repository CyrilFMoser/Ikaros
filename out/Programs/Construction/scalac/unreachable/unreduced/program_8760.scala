package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B, c: T_A[Char]) extends T_A[Char]
case class CC_B[B](a: CC_A, b: T_B) extends T_A[Char]
case class CC_C(a: T_A[Char], b: T_A[Char], c: CC_A) extends T_B
case class CC_D(a: T_A[Char], b: T_A[Char]) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_C(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(_, _)) => 1 
  case CC_A(_, CC_C(CC_A(_, _, _), CC_B(_, _), _), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_C(CC_A(_, _, _), CC_B(_, _), _), CC_B(_, _)) => 3 
  case CC_A(_, CC_C(CC_B(_, _), CC_A(_, _, _), _), CC_A(_, _, _)) => 4 
  case CC_A(_, CC_C(CC_B(_, _), CC_A(_, _, _), _), CC_B(_, _)) => 5 
  case CC_A(_, CC_C(CC_B(_, _), CC_B(_, _), _), CC_A(_, _, _)) => 6 
  case CC_A(_, CC_C(CC_B(_, _), CC_B(_, _), _), CC_B(_, _)) => 7 
  case CC_A(_, CC_D(CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 8 
  case CC_A(_, CC_D(CC_A(_, _, _), CC_A(_, _, _)), CC_B(_, _)) => 9 
  case CC_A(_, CC_D(CC_B(_, _), CC_A(_, _, _)), CC_A(_, _, _)) => 10 
  case CC_A(_, CC_D(CC_B(_, _), CC_A(_, _, _)), CC_B(_, _)) => 11 
  case CC_A(_, CC_D(CC_A(_, _, _), CC_B(_, _)), CC_A(_, _, _)) => 12 
  case CC_A(_, CC_D(CC_A(_, _, _), CC_B(_, _)), CC_B(_, _)) => 13 
  case CC_A(_, CC_D(CC_B(_, _), CC_B(_, _)), CC_A(_, _, _)) => 14 
  case CC_A(_, CC_D(CC_B(_, _), CC_B(_, _)), CC_B(_, _)) => 15 
  case CC_B(_, _) => 16 
}
}
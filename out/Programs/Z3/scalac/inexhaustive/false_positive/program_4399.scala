package Program_15 

package Program_8 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A) extends T_A
case class CC_B[B](a: Byte, b: T_A, c: T_A) extends T_A
case class CC_C(a: CC_B[Char], b: CC_A[T_A], c: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_A(_, CC_A(_, _)) => 2 
  case CC_C(CC_B(_, _, _), CC_A(_, _), _) => 3 
  case CC_C(_, _, CC_A(_, _)) => 4 
  case CC_C(_, _, _) => 5 
  case CC_C(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)) => 6 
  case CC_C(_, CC_A(_, _), CC_A(_, _)) => 7 
  case CC_C(CC_B(_, _, _), _, CC_A(_, _)) => 8 
  case CC_B(_, _, CC_A(_, _)) => 9 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 10 
  case CC_B(_, _, CC_C(_, _, _)) => 11 
  case CC_B(_, CC_A(_, _), CC_C(_, _, _)) => 12 
  case CC_B(_, CC_B(_, _, _), _) => 13 
  case CC_B(0, _, _) => 14 
  case CC_B(0, CC_A(_, _), CC_A(_, _)) => 15 
  case CC_B(0, CC_B(_, _, _), CC_A(_, _)) => 16 
  case CC_B(0, CC_B(_, _, _), CC_C(_, _, _)) => 17 
  case CC_B(0, CC_A(_, _), CC_B(_, _, _)) => 18 
  case CC_B(_, CC_B(_, _, _), CC_C(_, _, _)) => 19 
  case CC_B(0, CC_C(_, _, _), CC_B(_, _, _)) => 20 
  case CC_B(0, CC_A(_, _), CC_C(_, _, _)) => 21 
  case CC_B(_, CC_B(_, _, _), CC_A(_, _)) => 22 
  case CC_B(_, CC_C(_, _, _), CC_B(_, _, _)) => 23 
  case CC_B(0, _, CC_A(_, _)) => 24 
  case CC_B(_, CC_A(_, _), CC_A(_, _)) => 25 
  case CC_B(_, CC_A(_, _), _) => 26 
  case CC_B(0, CC_C(_, _, _), CC_A(_, _)) => 27 
  case CC_B(0, _, CC_C(_, _, _)) => 28 
  case CC_B(0, CC_C(_, _, _), CC_C(_, _, _)) => 29 
  case CC_B(0, CC_A(_, _), _) => 30 
  case CC_B(_, _, CC_B(_, _, _)) => 31 
  case CC_B(_, CC_A(_, _), CC_B(_, _, _)) => 32 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants
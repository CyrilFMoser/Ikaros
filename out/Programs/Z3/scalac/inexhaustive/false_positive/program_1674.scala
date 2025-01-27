package Program_31 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: Byte, c: T_A) extends T_A
case class CC_B(a: CC_A[T_A], b: Int, c: T_A) extends T_A
case class CC_C(a: CC_B, b: T_A) extends T_A
case class CC_D[E, D](a: T_B[Int, E], b: Boolean, c: CC_A[E]) extends T_B[D, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, 12, _) => 0 
  case CC_B(CC_A(_, _, _), 12, CC_C(_, _)) => 1 
  case CC_B(CC_A(_, _, _), _, CC_B(_, _, _)) => 2 
  case CC_B(_, _, CC_A(_, _, _)) => 3 
  case CC_B(CC_A(_, _, _), _, CC_A(_, _, _)) => 4 
  case CC_B(_, 12, CC_C(_, _)) => 5 
  case CC_B(CC_A(_, _, _), _, CC_C(_, _)) => 6 
  case CC_B(CC_A(_, _, _), 12, CC_B(_, _, _)) => 7 
  case CC_A(_, 0, CC_A(_, _, _)) => 8 
  case CC_A(_, _, _) => 9 
  case CC_A(CC_C(_, _), 0, CC_B(_, _, _)) => 10 
  case CC_A(CC_B(_, _, _), _, CC_C(_, _)) => 11 
  case CC_A(CC_A(_, _, _), _, CC_B(_, _, _)) => 12 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 13 
  case CC_A(CC_C(_, _), _, CC_A(_, _, _)) => 14 
  case CC_A(CC_C(_, _), _, CC_B(_, _, _)) => 15 
  case CC_A(CC_A(_, _, _), 0, CC_C(_, _)) => 16 
  case CC_A(CC_A(_, _, _), _, _) => 17 
  case CC_A(CC_B(_, _, _), 0, CC_A(_, _, _)) => 18 
  case CC_A(_, 0, CC_B(_, _, _)) => 19 
  case CC_A(_, 0, CC_C(_, _)) => 20 
  case CC_A(_, _, CC_C(_, _)) => 21 
  case CC_A(CC_B(_, _, _), _, CC_B(_, _, _)) => 22 
  case CC_A(CC_A(_, _, _), _, CC_C(_, _)) => 23 
  case CC_A(CC_B(_, _, _), 0, CC_C(_, _)) => 24 
  case CC_A(CC_B(_, _, _), _, CC_A(_, _, _)) => 25 
  case CC_A(_, _, CC_A(_, _, _)) => 26 
  case CC_A(_, 0, _) => 27 
  case CC_A(CC_C(_, _), 0, _) => 28 
  case CC_A(CC_A(_, _, _), 0, CC_B(_, _, _)) => 29 
  case CC_A(CC_C(_, _), 0, CC_A(_, _, _)) => 30 
  case CC_A(CC_B(_, _, _), _, _) => 31 
  case CC_A(CC_C(_, _), _, CC_C(_, _)) => 32 
  case CC_A(CC_C(_, _), 0, CC_C(_, _)) => 33 
  case CC_C(_, CC_A(_, _, _)) => 34 
  case CC_C(_, _) => 35 
  case CC_C(_, CC_C(_, _)) => 36 
  case CC_C(CC_B(_, _, _), CC_B(_, _, _)) => 37 
  case CC_C(CC_B(_, _, _), _) => 38 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Char (CC_B Char (CC_A Char Wildcard (T_A Char)) (T_A Char)) (T_A Char))
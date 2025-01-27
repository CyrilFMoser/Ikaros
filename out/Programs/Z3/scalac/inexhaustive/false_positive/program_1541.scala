package Program_30 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D, E](a: T_A[E, E], b: T_B, c: T_A[E, E]) extends T_A[D, C]
case class CC_B(a: T_A[T_B, (Int,Int)], b: Byte) extends T_B
case class CC_C(a: T_A[T_B, T_B], b: CC_B, c: T_A[Char, CC_B]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(), CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), CC_D(), CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), CC_B(_, _), CC_A(_, _, _)) => 2 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 3 
  case CC_A(_, _, CC_A(_, _, _)) => 4 
  case CC_A(_, CC_D(), _) => 5 
  case CC_A(CC_A(_, _, _), CC_C(_, _, _), _) => 6 
  case CC_A(CC_A(_, _, _), CC_B(_, _), _) => 7 
  case CC_A(_, CC_B(_, _), CC_A(_, _, _)) => 8 
  case CC_A(_, CC_C(_, _, _), _) => 9 
  case CC_A(_, _, _) => 10 
}
}
// This is not matched: (CC_A Int Byte T_B Wildcard Wildcard Wildcard (T_A Byte Int))
// This is not matched: (CC_A Char Char Char (T_A Char Char))
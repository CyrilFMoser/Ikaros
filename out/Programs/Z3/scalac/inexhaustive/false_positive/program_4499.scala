package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[B], b: T_A[C], c: T_A[(Boolean,Int)]) extends T_A[B]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: Boolean, b: Boolean, c: T_A[T_B]) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), _, CC_B()) => 1 
  case CC_A(CC_A(_, _, _), CC_B(), _) => 2 
  case CC_A(CC_B(), CC_B(), _) => 3 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 4 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B()) => 5 
  case CC_A(CC_B(), CC_B(), CC_A(_, _, _)) => 6 
  case CC_A(CC_B(), _, _) => 7 
  case CC_A(CC_B(), CC_A(_, _, _), _) => 8 
  case CC_A(_, CC_B(), _) => 9 
  case CC_A(CC_A(_, _, _), CC_B(), CC_B()) => 10 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 11 
  case CC_A(_, CC_B(), CC_B()) => 12 
  case CC_A(_, CC_A(_, _, _), _) => 13 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 14 
}
}
// This is not matched: (CC_A Char T_B Wildcard (CC_B T_B (T_A T_B)) Wildcard (T_A Char))
// This is not matched: (CC_B Char (T_A Char))
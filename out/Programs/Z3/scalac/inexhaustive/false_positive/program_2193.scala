package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_B, b: T_A[B], c: T_A[C]) extends T_A[B]
case class CC_B[D]() extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D() extends T_B
case class CC_E(a: CC_C[CC_D], b: CC_A[(Char,Char), CC_D], c: (T_B,Char)) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_A(CC_D(), CC_C(), CC_A(_, _, _)) => 2 
  case CC_A(CC_D(), CC_B(), CC_B()) => 3 
  case CC_A(CC_D(), _, CC_B()) => 4 
  case CC_A(_, _, _) => 5 
  case CC_A(CC_D(), CC_C(), CC_B()) => 6 
  case CC_A(CC_E(_, _, _), CC_C(), _) => 7 
  case CC_A(CC_E(_, _, _), CC_B(), CC_A(_, _, _)) => 8 
  case CC_A(CC_D(), CC_B(), CC_A(_, _, _)) => 9 
  case CC_A(CC_D(), CC_A(_, _, _), CC_C()) => 10 
  case CC_A(CC_E(_, _, _), CC_B(), CC_B()) => 11 
  case CC_A(CC_E(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 12 
  case CC_A(CC_D(), CC_A(_, _, _), CC_A(_, _, _)) => 13 
  case CC_A(_, _, CC_C()) => 14 
  case CC_A(_, CC_C(), CC_A(_, _, _)) => 15 
  case CC_A(CC_D(), CC_A(_, _, _), CC_B()) => 16 
  case CC_A(_, CC_C(), CC_B()) => 17 
  case CC_A(CC_D(), _, CC_C()) => 18 
  case CC_A(CC_E(_, _, _), CC_B(), CC_C()) => 19 
  case CC_A(CC_D(), CC_B(), CC_C()) => 20 
  case CC_A(CC_E(_, _, _), _, CC_C()) => 21 
  case CC_A(_, CC_A(_, _, _), CC_B()) => 22 
  case CC_A(CC_D(), CC_A(_, _, _), _) => 23 
  case CC_A(_, CC_A(_, _, _), CC_C()) => 24 
  case CC_A(CC_E(_, _, _), _, _) => 25 
}
}
// This is not matched: (CC_A Char T_B (CC_D T_B) Wildcard Wildcard (T_A Char))
// This is not matched: (CC_E Wildcard T_B)
package Program_13 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char, b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B[C](a: CC_A[C], b: T_A[C]) extends T_A[C]
case class CC_C[D, E]() extends T_A[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(CC_A(_, _, _), CC_C()) => 1 
  case CC_B(_, CC_C()) => 2 
  case CC_B(CC_A(_, _, _), CC_B(_, _)) => 3 
  case CC_B(CC_A(_, _, _), _) => 4 
  case CC_B(_, _) => 5 
  case CC_A('x', _, CC_C()) => 6 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 7 
  case CC_A('x', _, CC_B(_, _)) => 8 
  case CC_A('x', CC_A(_, _, _), CC_B(_, _)) => 9 
  case CC_A(_, _, _) => 10 
}
}
// This is not matched: (CC_C Byte Boolean (T_A Byte))
// This is not matched: (CC_B Wildcard Wildcard T_A)
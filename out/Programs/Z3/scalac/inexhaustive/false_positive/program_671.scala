package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: B, c: T_A[B]) extends T_A[B]
case class CC_B[C](a: CC_A[C], b: CC_A[C], c: T_B) extends T_A[CC_A[T_B]]
case class CC_C() extends T_A[CC_A[T_B]]
case class CC_D(a: T_A[(Byte,Boolean)]) extends T_B
case class CC_E(a: (CC_C,CC_C)) extends T_B

val v_a: T_A[CC_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_A(_, CC_A(_, _, _), CC_C()) => 2 
  case CC_A(CC_A(_, _, _), _, _) => 3 
  case CC_A(_, CC_A(_, _, _), _) => 4 
  case CC_A(_, _, CC_A(_, _, _)) => 5 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 6 
  case CC_A(_, _, CC_B(_, _, _)) => 7 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 8 
  case CC_A(CC_A(_, _, _), _, CC_B(_, _, _)) => 9 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _, _)) => 10 
  case CC_A(_, _, CC_C()) => 11 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 12 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C()) => 13 
  case CC_A(_, _, _) => 14 
  case CC_B(CC_A(_, _, _), _, CC_E(_)) => 15 
  case CC_B(_, CC_A(_, _, _), _) => 16 
  case CC_B(_, _, CC_D(_)) => 17 
  case CC_B(CC_A(_, _, _), _, CC_D(_)) => 18 
  case CC_B(CC_A(_, _, _), _, _) => 19 
  case CC_B(_, _, _) => 20 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_D(_)) => 21 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard Wildcard (T_A (CC_A T_B T_B T_B T_B T_B)))
// This is not matched: (CC_B T_A)
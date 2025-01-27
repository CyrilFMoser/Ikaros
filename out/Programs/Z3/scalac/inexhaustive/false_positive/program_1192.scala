package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[Char]]
case class CC_B[C](a: CC_A[C], b: T_A[C]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _)) => 0 
  case CC_A(_) => 1 
  case CC_B(CC_A(_), CC_B(_, _)) => 2 
  case CC_B(_, CC_B(_, _)) => 3 
  case CC_B(_, CC_A(_)) => 4 
  case CC_B(CC_A(_), CC_A(_)) => 5 
  case CC_B(_, _) => 6 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Char)))
// This is not matched: (CC_C Wildcard T_A)
package Program_13 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B], c: T_A[B]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_A Char)))
// This is not matched: (CC_A T_A)
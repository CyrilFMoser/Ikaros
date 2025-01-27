package Program_27 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[Byte]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[CC_A]) extends T_A[CC_A]
case class CC_C[B](a: T_A[B], b: CC_B) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A('x', _) => 1 
  case CC_C(CC_C(_, _), CC_B(_)) => 3 
  case CC_C(CC_C(_, _), _) => 4 
  case CC_C(_, _) => 5 
  case CC_C(_, CC_B(_)) => 6 
}
}
// This is not matched: (CC_C Boolean Wildcard Wildcard (T_A (T_A Byte)))
// Mutation information: 
// Deleted Pattern CC_C(CC_A(_, _), CC_B(_)) at position 2
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Byte)))
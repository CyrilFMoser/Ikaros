package Program_15 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[Boolean]) extends T_A[T_A[Byte]]
case class CC_B[B](a: T_A[B], b: CC_A, c: B) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), _) => 1 
  case CC_B(CC_A(_, _), _, _) => 2 
  case CC_B(CC_B(_, _, _), _, _) => 3 
}
}
// This is not matched: (CC_B (T_A Byte) Wildcard Wildcard Wildcard (T_A (T_A Byte)))
// This is not matched: (CC_B (CC_B (CC_B (CC_B Wildcard T_A) T_A) T_A) T_A)
package Program_31 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: Byte) extends T_A[B]
case class CC_B[D](a: T_A[T_B], b: CC_A[T_B, T_B]) extends T_A[D]
case class CC_C[E](a: CC_B[E], b: T_A[E]) extends T_A[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _) => 2 
  case CC_B(CC_B(_, _), CC_A(_)) => 3 
  case CC_C(CC_B(_, _), CC_C(_, _)) => 4 
  case CC_C(CC_B(_, _), _) => 5 
}
}
// This is not matched: (CC_A Char T_B Wildcard (T_A Char))
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)
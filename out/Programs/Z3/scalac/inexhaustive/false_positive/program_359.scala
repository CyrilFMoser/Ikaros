package Program_27 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: T_A[B]) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char))
// This is not matched: (CC_C Wildcard Wildcard (T_A (T_A Int)))
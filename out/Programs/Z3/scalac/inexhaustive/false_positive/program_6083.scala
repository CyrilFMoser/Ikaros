package Program_15 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_A[D, D], b: T_B) extends T_A[C, D]
case class CC_B(a: Boolean, b: CC_A[T_B, T_B]) extends T_A[(Char,T_B), Char]
case class CC_C(a: T_A[CC_B, CC_B]) extends T_A[(Char,T_B), Char]
case class CC_D[E](a: CC_B, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _), CC_B(_, _)) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: (CC_D T_B Wildcard Wildcard T_B)
// This is not matched: (CC_E Wildcard T_B)
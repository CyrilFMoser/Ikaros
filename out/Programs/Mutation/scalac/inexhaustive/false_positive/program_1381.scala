package Program_29 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D], b: D) extends T_A[T_A[D, D], D]
case class CC_C[E](a: CC_A[E], b: T_A[E, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
  case CC_B(CC_A(_), 12) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Wildcard Wildcard T_A)
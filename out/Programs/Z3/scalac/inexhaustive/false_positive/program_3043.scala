package Program_14 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E]) extends T_A[Boolean, E]
case class CC_B[F, G, H](a: Int, b: Int) extends T_A[F, G]
case class CC_C[I](a: T_A[Boolean, I], b: T_A[I, I], c: I) extends T_B[CC_B[Int, Char, Int], I]

val v_a: CC_B[Boolean, Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B T_A)
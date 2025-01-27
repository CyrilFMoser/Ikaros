package Program_13 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A) extends T_A
case class CC_B[C](a: ((Char,Boolean),T_A)) extends T_B[C]
case class CC_C[D](a: T_A, b: T_B[D], c: CC_B[D]) extends T_B[D]
case class CC_D[E](a: E, b: T_B[E], c: E) extends T_B[E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
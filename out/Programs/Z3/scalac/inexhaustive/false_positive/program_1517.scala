package Program_29 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: (T_A,Boolean), b: T_A, c: T_A) extends T_A
case class CC_B[D](a: T_B[D, D], b: D, c: T_B[D, D]) extends T_B[D, CC_A[T_A]]
case class CC_C[E](a: (T_A,(Int,Boolean)), b: Int, c: T_B[E, E]) extends T_B[E, CC_A[T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),_), _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_E Wildcard T_B)
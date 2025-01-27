package Program_29 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, Boolean], b: T_A[C, D], c: T_A[Byte, Boolean]) extends T_A[C, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard Wildcard (T_A Int Boolean))
// This is not matched: (CC_C T_A)
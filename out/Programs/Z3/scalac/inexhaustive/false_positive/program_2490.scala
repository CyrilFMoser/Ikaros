package Program_30 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, Boolean], b: T_A[C, D], c: T_A[Byte, Boolean]) extends T_A[C, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Int (T_A Boolean Boolean) Wildcard Wildcard Wildcard (T_A Int Boolean))
// This is not matched: (CC_C T_A)
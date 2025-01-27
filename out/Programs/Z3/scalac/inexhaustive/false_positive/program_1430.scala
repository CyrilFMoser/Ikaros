package Program_28 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[D, C], b: T_A[T_B, C], c: T_A[D, C]) extends T_A[T_B, C]

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A Char T_B Wildcard Wildcard Wildcard (T_A T_B Char))
// This is not matched: (CC_A T_A)
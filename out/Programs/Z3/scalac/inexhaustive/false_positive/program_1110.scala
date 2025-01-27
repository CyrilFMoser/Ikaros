package Program_30 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: T_A[C, D]) extends T_A[T_A[C, C], C]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Wildcard T_A)
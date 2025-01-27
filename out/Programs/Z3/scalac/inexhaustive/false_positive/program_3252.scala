package Program_14 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[Byte, E]) extends T_A[C, D]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Boolean Wildcard (T_A Byte Boolean))
// This is not matched: (CC_A T_B (CC_C T_B T_B) Wildcard Wildcard (T_A T_B (CC_C T_B T_B)))
package Program_30 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E](a: T_A[D, D]) extends T_A[D, C]
case class CC_B(a: T_A[T_B, Int]) extends T_B
case class CC_C() extends T_B

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Char T_B Wildcard (T_A Byte Char))
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Int)))
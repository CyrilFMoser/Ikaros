package Program_30 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[Char, C]
case class CC_B(a: T_B, b: T_A[Char, T_B]) extends T_A[Char, T_B]
case class CC_C(a: Int, b: T_A[Char, T_B]) extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_, _), _) => 1 
}
}
// This is not matched: (CC_A T_B T_B (T_A Char T_B))
// This is not matched: (CC_C (T_A (T_A Boolean)))
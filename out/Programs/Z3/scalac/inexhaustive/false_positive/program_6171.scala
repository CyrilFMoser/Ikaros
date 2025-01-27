package Program_14 

package Program_6 

object Test {
sealed trait T_A
case class CC_A[A]() extends T_A
case class CC_B(a: Char, b: Int, c: CC_A[Char]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 12, _) => 1 
  case CC_B(_, _, CC_A()) => 2 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_C Wildcard Wildcard (T_A T_B))
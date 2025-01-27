package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E]() extends T_A[D, C]

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char T_B T_B (T_A Char T_B))
// This is not matched: (CC_B Wildcard Wildcard T_A)
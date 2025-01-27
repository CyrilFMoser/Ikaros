package Program_30 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E]() extends T_A[D, C]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Int Boolean (T_A Boolean Int))
// This is not matched: (CC_D Wildcard Wildcard Wildcard T_B)
package Program_13 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E]() extends T_A[D, C]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Byte Boolean (T_A Byte Int))
// This is not matched: (CC_B Wildcard (CC_B Wildcard Wildcard Wildcard T_A) Wildcard T_A)
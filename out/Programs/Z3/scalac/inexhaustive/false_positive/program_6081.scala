package Program_15 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E]() extends T_A[D, C]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char Int Boolean (T_A Char Int))
// This is not matched: (CC_D (T_B (CC_B T_A) (CC_B T_A)) Boolean (T_B (T_B (CC_B T_A) (CC_B T_A)) T_A))
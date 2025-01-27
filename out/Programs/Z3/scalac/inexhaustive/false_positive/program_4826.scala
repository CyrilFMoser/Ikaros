package Program_15 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C, D, E]() extends T_B[C, D]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B Byte Int T_A (T_B Byte Int))
// This is not matched: (CC_B T_A T_A)
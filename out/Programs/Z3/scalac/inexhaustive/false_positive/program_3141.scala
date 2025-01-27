package Program_15 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[D, C, E]() extends T_B[C, D]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D Byte Byte T_A (T_B Byte Byte))
// This is not matched: (CC_A T_A)
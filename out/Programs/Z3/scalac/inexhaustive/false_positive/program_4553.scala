package Program_13 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B, C]() extends T_B[B]
case class CC_C[D]() extends T_B[D]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
}
}
// This is not matched: (CC_B Byte T_A (T_B Byte))
// This is not matched: (CC_B T_A T_A)
package Program_14 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Boolean) extends T_A
case class CC_C[B]() extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C T_A (T_B (CC_B T_A (T_B T_A))))
// This is not matched: (CC_A Byte (T_A (T_B Byte Byte) Byte))
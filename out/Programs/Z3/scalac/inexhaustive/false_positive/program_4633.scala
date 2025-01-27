package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_B(a: Boolean, b: T_B[(Byte,Boolean)]) extends T_A
case class CC_C[B]() extends T_B[B]
case class CC_D[C]() extends T_B[C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D()) => 0 
}
}
// This is not matched: (CC_C Boolean Byte (T_A Boolean Byte))
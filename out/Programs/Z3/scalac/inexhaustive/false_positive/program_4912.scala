package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[H, G](a: ((Boolean,Boolean),Int)) extends T_A[G, H]
case class CC_C() extends T_A[Byte, CC_B[Boolean, Byte]]

val v_a: CC_B[CC_C, Int] = null
val v_b: Int = v_a match{
  case CC_B((_,12)) => 0 
}
}
// This is not matched: (CC_D Byte Byte (CC_B T_A) Byte (T_B Byte Byte))
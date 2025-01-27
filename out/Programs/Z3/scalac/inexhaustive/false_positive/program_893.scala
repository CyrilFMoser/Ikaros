package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_B[G, F]() extends T_B[F, G]
case class CC_C[H](a: Byte) extends T_B[H, CC_B[Byte, (Char,Byte)]]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A (Tuple Int Boolean))))
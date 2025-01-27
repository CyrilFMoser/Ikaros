package Program_14 

object Test {
sealed trait T_B[C]
case class CC_C[H](a: H) extends T_B[H]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Byte (T_A Byte))
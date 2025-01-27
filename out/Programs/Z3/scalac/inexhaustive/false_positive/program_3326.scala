package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B[C, D](a: D) extends T_B[D, C]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_C T_A)
package Program_13 

object Test {
sealed trait T_B[C, D]
case class CC_C[I, J](a: J) extends T_B[I, J]

val v_a: CC_C[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_C (T_A (CC_A T_B)))
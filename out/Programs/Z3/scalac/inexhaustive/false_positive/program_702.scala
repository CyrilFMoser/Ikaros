package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_C[I, J](a: Int) extends T_B[J, I]

val v_a: CC_C[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_D Byte (T_B Byte))
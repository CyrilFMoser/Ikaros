package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_C[J, I](a: Char) extends T_B[I, J]

val v_a: CC_C[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_C Wildcard (T_A (T_B Int Boolean) (T_B Char Int)))
package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_E(a: T_B[Char, Byte], b: Int) extends T_B[Int, T_B[Char, Byte]]

val v_a: T_B[Int, T_B[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_E(_, 12) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)
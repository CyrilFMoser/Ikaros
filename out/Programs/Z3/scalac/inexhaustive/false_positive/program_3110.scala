package Program_15 

object Test {
sealed trait T_B[B, C]
case class CC_B[E](a: T_B[(Char,Int), E], b: Byte) extends T_B[E, T_B[E, Byte]]

val v_a: T_B[Int, T_B[Int, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: (CC_C Char (T_A (T_A Int Byte) Char))
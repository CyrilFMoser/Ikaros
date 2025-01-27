package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: Byte) extends T_A[D, T_A[Char, Char]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_C (CC_B Byte T_A) Wildcard T_A)
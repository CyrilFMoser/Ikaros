package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: D) extends T_A[D, T_A[Byte, Char]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
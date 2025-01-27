package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: Byte) extends T_A[Byte, T_A[Int, Int]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_D Wildcard T_B)
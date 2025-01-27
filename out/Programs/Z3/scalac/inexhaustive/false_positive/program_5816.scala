package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte) extends T_A[D, C]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Wildcard T_B)
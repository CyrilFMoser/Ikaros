package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte) extends T_A[C, D]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_B)
package Program_14 

object Test {
sealed trait T_A[A]
case class CC_B[B](a: Byte) extends T_A[B]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)
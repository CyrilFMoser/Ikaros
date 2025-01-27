package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: Byte) extends T_A[T_B, D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A (CC_A (CC_A Wildcard T_A) T_A) T_A)
package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: T_A[D, Byte], b: Int) extends T_A[D, T_A[D, Boolean]]

val v_a: T_A[Int, T_A[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard (CC_B T_A) Wildcard T_A) Wildcard Wildcard T_A)
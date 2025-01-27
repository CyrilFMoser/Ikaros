package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Int, C]
case class CC_B[D](a: Byte, b: T_A[D, D]) extends T_A[D, CC_A[Boolean]]

val v_a: T_A[Byte, CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(0, _) => 0 
}
}
// This is not matched: (CC_D Wildcard Wildcard Wildcard T_B)
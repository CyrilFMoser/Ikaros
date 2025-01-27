package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Byte) extends T_A[D, C]

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard Wildcard T_A) Wildcard Wildcard T_A)
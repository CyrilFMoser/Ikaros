package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte) extends T_A[B]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)
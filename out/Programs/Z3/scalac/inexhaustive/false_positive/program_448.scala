package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte) extends T_A[B]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_B)
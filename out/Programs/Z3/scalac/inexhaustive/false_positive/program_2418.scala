package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: D) extends T_A[D]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_D Wildcard Wildcard Wildcard T_B)
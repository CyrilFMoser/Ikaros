package Program_30 

object Test {
sealed trait T_A[A]
case class CC_C(a: Int) extends T_A[Byte]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard Byte T_A) Wildcard Wildcard T_A)
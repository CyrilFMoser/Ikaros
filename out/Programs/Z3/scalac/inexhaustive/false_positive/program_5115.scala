package Program_15 

object Test {
sealed trait T_A[A]
case class CC_B(a: Byte) extends T_A[T_A[Char]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_C (CC_B Wildcard Int (CC_A T_A) T_A) Wildcard Wildcard T_A)
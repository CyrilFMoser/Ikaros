package Program_14 

object Test {
sealed trait T_A[A]
case class CC_B(a: Int) extends T_A[T_A[Char]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_C Wildcard T_B)
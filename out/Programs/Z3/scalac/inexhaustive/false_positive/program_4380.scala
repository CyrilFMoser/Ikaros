package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B() extends T_A[(T_B,(Boolean,Char))]
case class CC_D(a: Byte, b: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(0, _) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)
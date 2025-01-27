package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte) extends T_A[T_B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_C Char Wildcard Byte (T_B T_A Char))
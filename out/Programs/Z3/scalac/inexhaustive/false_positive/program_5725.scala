package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Byte) extends T_A[C, D]
case class CC_C() extends T_A[T_A[Byte, Char], T_A[Boolean, Boolean]]

val v_a: CC_A[CC_C, Char] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_C T_B)
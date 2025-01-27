package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Int) extends T_A[C, D]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_C T_B)
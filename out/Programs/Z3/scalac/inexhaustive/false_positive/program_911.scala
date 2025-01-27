package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: Byte) extends T_A[D, Int]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A T_A)
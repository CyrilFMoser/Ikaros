package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Int, Int], C]
case class CC_B[D](a: Byte) extends T_A[CC_A[(Byte,Byte)], D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_C T_A Wildcard T_A)
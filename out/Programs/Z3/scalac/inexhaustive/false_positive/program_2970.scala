package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: Int) extends T_A[T_A[Byte, Byte], (Boolean,Int)]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B T_A)
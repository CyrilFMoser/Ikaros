package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_C[H](a: H) extends T_A[H, Byte]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B T_A)
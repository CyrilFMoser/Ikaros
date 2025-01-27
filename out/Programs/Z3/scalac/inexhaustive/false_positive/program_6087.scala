package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: Byte) extends T_A[(Int,Int), D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Boolean T_A) Wildcard T_A)
package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[H, G](a: Char) extends T_A[G, H]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_E T_B)
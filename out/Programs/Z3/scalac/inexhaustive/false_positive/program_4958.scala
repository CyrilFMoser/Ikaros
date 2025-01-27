package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[G, H](a: H) extends T_A[H, G]

val v_a: CC_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A (T_A Int Byte))
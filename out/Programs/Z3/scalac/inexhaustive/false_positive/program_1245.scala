package Program_31 

object Test {
sealed trait T_A[A]
case class CC_B(a: Char) extends T_A[Boolean]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A (CC_C Boolean Boolean Boolean) (T_A (CC_C Boolean Boolean Boolean)))
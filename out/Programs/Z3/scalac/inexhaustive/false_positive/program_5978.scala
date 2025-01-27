package Program_14 

object Test {
sealed trait T_A[A]
case class CC_B(a: Char) extends T_A[Byte]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Int (CC_B Int Wildcard (T_A Int)) (T_A Int))
package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: Char) extends T_A[T_A[Boolean, Int], T_A[T_A[Boolean, Int], T_A[Boolean, Int]]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_D Wildcard Wildcard (T_B (T_A Int)))
package Program_11 

object Test {
sealed trait T_A[A]
case class CC_B(a: Int) extends T_A[T_A[Boolean]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A (T_A Int Int) Int Wildcard Wildcard Wildcard (T_A Int (T_A Int Int)))
package Program_31 

package Program_4 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B[A]() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
  case CC_A(CC_A(_)) => 1 
}
}
// This is not matched: (CC_A (CC_B T_A T_A) T_A)
// This is not matched: (CC_B (T_A Int) Wildcard Wildcard (T_A (T_A Int)))
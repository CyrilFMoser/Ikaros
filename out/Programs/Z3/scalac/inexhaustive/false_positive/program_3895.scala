package Program_15 

package Program_2 

object Test {
sealed trait T_A
case class CC_A[A](a: Int) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_A (T_A T_B T_B))
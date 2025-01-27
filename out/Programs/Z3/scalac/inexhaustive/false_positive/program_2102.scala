package Program_28 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_A, b: T_B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A T_B Wildcard Wildcard T_A)
// This is not matched: (CC_B T_B T_B Wildcard (T_A T_B))
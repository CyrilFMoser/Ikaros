package Program_31 

package Program_13 

object Test {
sealed trait T_A
case class CC_A[A](a: A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_D T_B Wildcard (CC_C T_B (T_A T_B)) Wildcard T_B)
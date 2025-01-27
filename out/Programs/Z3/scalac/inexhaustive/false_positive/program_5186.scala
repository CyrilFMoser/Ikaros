package Program_15 

package Program_8 

object Test {
sealed trait T_A
case class CC_A[A](a: A) extends T_A
case class CC_B(a: T_A, b: Boolean) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_D Wildcard (CC_C T_B Wildcard (T_A T_B T_B)) T_B)
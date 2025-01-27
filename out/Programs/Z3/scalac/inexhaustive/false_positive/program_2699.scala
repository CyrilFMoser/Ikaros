package Program_30 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_B, c: (T_B,T_A)) extends T_A
case class CC_B[A](a: Boolean, b: T_B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_A(_, _, _) => 2 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
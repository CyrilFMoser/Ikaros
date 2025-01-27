package Program_31 

package Program_1 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Int, c: Boolean) extends T_A
case class CC_B[A](a: CC_A) extends T_A
case class CC_C(a: T_A) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), 12, _) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_A(_, 12, _) => 2 
  case CC_A(CC_B(_), _, _) => 3 
  case CC_A(CC_B(_), 12, _) => 4 
  case CC_A(CC_C(_), _, _) => 5 
}
}
// This is not matched: (CC_A (CC_B T_A Wildcard T_A) Wildcard Wildcard T_A)
// This is not matched: (CC_D T_B)
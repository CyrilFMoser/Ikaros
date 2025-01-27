package Program_14 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: T_A) extends T_A
case class CC_C() extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: (CC_B T_A Wildcard T_A)
// This is not matched: (CC_A Wildcard (CC_B Wildcard T_A) Wildcard T_A)
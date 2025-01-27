package Program_14 

package Program_15 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), CC_B()) => 1 
  case CC_A(CC_A(_, _), CC_B()) => 2 
  case CC_A(CC_B(), CC_A(_, _)) => 3 
  case CC_A(CC_B(), _) => 4 
}
}
// This is not matched: (CC_A Char (CC_A T_A Wildcard (CC_B T_A) T_A) Wildcard T_A)
// This is not matched: (CC_A Char (CC_A T_A Wildcard (CC_B T_A) T_A) Wildcard T_A)
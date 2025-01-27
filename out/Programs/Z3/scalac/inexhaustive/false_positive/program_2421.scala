package Program_31 

package Program_8 

object Test {
sealed trait T_A
case class CC_A[A](a: Byte, b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, _) => 1 
  case CC_A(0, _, CC_B()) => 2 
  case CC_A(0, _, _) => 3 
  case CC_A(0, CC_A(_, _, _), _) => 4 
  case CC_A(_, CC_B(), CC_B()) => 5 
  case CC_A(0, CC_B(), _) => 6 
  case CC_A(0, _, CC_A(_, _, _)) => 7 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A T_B Char Wildcard Wildcard (T_A T_B))
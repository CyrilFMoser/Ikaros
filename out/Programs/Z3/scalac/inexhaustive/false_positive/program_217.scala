package Program_31 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_A, b: A) extends T_A
case class CC_B(a: Byte, b: T_B, c: T_A) extends T_A
case class CC_C(a: T_B, b: (CC_B,T_A)) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(CC_A(_, _), _) => 1 
  case CC_B(0, CC_C(_, _), _) => 2 
  case CC_B(_, _, _) => 3 
  case CC_B(_, _, CC_A(_, _)) => 4 
  case CC_B(_, _, CC_B(_, _, _)) => 5 
  case CC_B(0, _, _) => 6 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
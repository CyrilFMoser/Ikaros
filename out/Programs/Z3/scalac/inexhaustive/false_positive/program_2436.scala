package Program_31 

package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: Byte, b: T_A, c: Byte) extends T_A
case class CC_B(a: T_A, b: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_A(0, CC_A(_, _, _), 0) => 2 
  case CC_A(_, CC_A(_, _, _), _) => 3 
  case CC_A(_, CC_B(_, _), _) => 4 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Byte Int Wildcard (T_A Byte Int))
package Program_14 

package Program_3 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: A, c: Int) extends T_A
case class CC_B(a: T_A, b: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, 12) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants
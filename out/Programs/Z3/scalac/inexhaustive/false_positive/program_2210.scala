package Program_31 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A, c: T_A) extends T_A
case class CC_B[C](a: Boolean, b: C) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(_, CC_B(_, _), CC_A(_, _, _)) => 1 
  case CC_A(_, CC_B(_, _), _) => 2 
  case CC_A(_, CC_A(_, _, _), _) => 3 
  case CC_A(_, _, CC_A(_, _, _)) => 4 
  case CC_A(_, CC_B(_, _), CC_B(_, _)) => 5 
  case CC_A(_, _, CC_B(_, _)) => 6 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B T_A)
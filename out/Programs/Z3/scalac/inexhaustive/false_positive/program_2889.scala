package Program_29 

package Program_1 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B[A](a: CC_A, b: T_A, c: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_B(_, _, _), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_A(), _, CC_A()) => 3 
  case CC_B(_, CC_B(_, _, _), CC_A()) => 4 
  case CC_B(CC_A(), _, _) => 5 
  case CC_B(_, CC_B(_, _, _), _) => 6 
  case CC_B(CC_A(), CC_A(), _) => 7 
  case CC_B(_, CC_A(), CC_A()) => 8 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Boolean (T_A (T_A Boolean Char) Char))
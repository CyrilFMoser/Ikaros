package Program_13 

package Program_9 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: Char, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_A(_, 'x', CC_A(_, _, _)) => 2 
  case CC_A(_, 'x', _) => 3 
  case CC_A(_, _, _) => 4 
  case CC_A(CC_A(_, _, _), 'x', CC_A(_, _, _)) => 5 
}
}
// This is not matched: (CC_A T_A
//      (CC_A (Generic "A") Wildcard Wildcard Wildcard T_A)
//      Wildcard
//      Wildcard
//      T_A)
// This is not matched: (CC_E T_A
//      Wildcard
//      (CC_A Wildcard Wildcard Wildcard T_A)
//      (T_B (Tuple (CC_B T_A T_A T_A) T_A) T_A))
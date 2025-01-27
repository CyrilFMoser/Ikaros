package Program_28 

package Program_5 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: Int, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), 12, CC_A(_, _, _)) => 0 
  case CC_A(_, 12, CC_A(_, _, _)) => 1 
  case CC_A(_, _, CC_A(_, _, _)) => 2 
  case CC_A(CC_A(_, _, _), _, _) => 3 
  case CC_A(_, 12, _) => 4 
}
}
// This is not matched: (CC_A T_A
//      (CC_A (Generic "A") Wildcard Wildcard Wildcard T_A)
//      Wildcard
//      Wildcard
//      T_A)
// This is not matched: Pattern match is empty without constants
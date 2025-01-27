package Program_31 

package Program_7 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B[A](a: T_A, b: ((Boolean,Byte),Boolean), c: Boolean) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), CC_B(_, _, _)) => 0 
  case CC_A(CC_A(_, _), _) => 1 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 2 
  case CC_A(_, _) => 3 
  case CC_A(CC_B(_, _, _), _) => 4 
  case CC_A(_, CC_A(_, _)) => 5 
  case CC_B(CC_A(_, _), ((_,_),_), _) => 6 
  case CC_B(_, _, _) => 7 
  case CC_B(CC_A(_, _), _, _) => 8 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B (T_B Int) Int Wildcard (T_A (T_B Int)))
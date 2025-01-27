package Program_31 

package Program_7 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: CC_A, b: ((Boolean,Boolean),CC_A), c: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(_) => 1 
  case CC_B(CC_A(_), ((_,_),CC_A(_)), _) => 2 
  case CC_B(CC_A(_), ((_,_),CC_A(_)), CC_A(_)) => 3 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Wildcard T_A)
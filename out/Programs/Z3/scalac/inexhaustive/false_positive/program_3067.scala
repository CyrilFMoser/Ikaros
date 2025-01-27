package Program_15 

package Program_5 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A
case class CC_B(a: (T_A,T_A)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B((CC_B(_),CC_B(_))) => 1 
  case CC_B((CC_A(_),CC_A(_))) => 2 
  case CC_B((CC_A(_),CC_B(_))) => 3 
  case CC_A(_) => 4 
  case CC_A(CC_B(_)) => 5 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: Pattern match is empty without constants
package Program_30 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B], b: T_B[B], c: Char) extends T_A
case class CC_B(a: Int) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_B(12) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants
package Program_30 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C[B](a: B, b: B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
  case CC_B(_) => 2 
  case CC_B('x') => 3 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants
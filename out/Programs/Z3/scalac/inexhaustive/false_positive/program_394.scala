package Program_31 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_A, b: T_B) extends T_A
case class CC_B(a: Byte) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(0) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants
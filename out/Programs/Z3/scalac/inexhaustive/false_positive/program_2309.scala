package Program_30 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Byte, b: T_B, c: T_A) extends T_A
case class CC_B[A](a: T_B) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_), CC_A(_, _, _)) => 0 
  case CC_A(0, _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_A Wildcard (CC_B T_A (CC_B T_A Wildcard T_B) T_B) Wildcard T_A)
// This is not matched: Pattern match is empty without constants
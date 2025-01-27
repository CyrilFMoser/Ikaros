package Program_31 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_B[CC_A, CC_A]) extends T_A
case class CC_C[C](a: C) extends T_B[CC_B, T_B[Boolean, (Char,Byte)]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), CC_A(_), _) => 0 
}
}
// This is not matched: (CC_B (CC_A Wildcard T_A) Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants
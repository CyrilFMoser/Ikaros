package Program_30 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Byte, b: T_B) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C[A](a: CC_B, b: T_B, c: A) extends T_A
case class CC_D(a: T_B) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(12) => 1 
  case CC_B(_) => 2 
  case CC_C(_, _, _) => 3 
  case CC_C(CC_B(_), CC_D(_), _) => 4 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants
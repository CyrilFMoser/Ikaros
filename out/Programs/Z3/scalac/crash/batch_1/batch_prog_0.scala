package Program_0 

object Test {
sealed trait T_A
case class CC_A(a: Byte) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), CC_A(_)) => 0 
  case CC_B(_, CC_A(_)) => 1 
}
}
// This is not matched: (CC_A Wildcard T_A)
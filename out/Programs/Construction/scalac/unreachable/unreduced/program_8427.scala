package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[(T_A,T_A)], c: Int) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: Boolean) extends T_A
case class CC_C(a: CC_B, b: CC_B) extends T_A
case class CC_D(a: T_B[Boolean], b: T_B[CC_B]) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, _, _), CC_B(CC_A(_, _, _), CC_A(_, _, _), _))
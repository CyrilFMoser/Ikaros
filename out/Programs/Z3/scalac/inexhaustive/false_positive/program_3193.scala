package Program_14 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: Byte) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C[A](a: CC_A) extends T_A
case class CC_D() extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_B(CC_A(_, _), CC_A(_, _)) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: (CC_C T_A Wildcard T_A)
// This is not matched: (CC_B Wildcard Wildcard T_A)
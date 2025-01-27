package Program_31 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Int, b: T_A) extends T_A
case class CC_B[A](a: A, b: T_B, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[B](a: CC_C) extends T_B
case class CC_E() extends T_B

val v_a: CC_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(), CC_E(), CC_A(_, _)) => 0 
  case CC_B(_, CC_D(_), CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_B (CC_C T_B) Wildcard (CC_D T_A Wildcard T_B) Wildcard T_A)
// This is not matched: (CC_B Wildcard T_A)
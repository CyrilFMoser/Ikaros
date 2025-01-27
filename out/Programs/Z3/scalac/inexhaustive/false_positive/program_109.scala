package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_D() extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(CC_B(_, _), _)) => 1 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)
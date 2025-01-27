package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: T_B[CC_A]) extends T_A
case class CC_C(a: CC_B, b: T_A) extends T_A
case class CC_D() extends T_B[T_B[T_B[Boolean]]]
case class CC_E(a: (CC_D,CC_C)) extends T_B[T_B[T_B[Boolean]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_B(_), _) => 1 
}
}
// This is not matched: CC_B(_)
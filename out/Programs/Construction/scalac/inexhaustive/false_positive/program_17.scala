package Program_63 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[(T_A,T_A), T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[CC_B, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(CC_C(CC_B(_)))
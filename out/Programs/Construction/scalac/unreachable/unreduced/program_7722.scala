package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_B,T_A[Boolean])]
case class CC_B(a: T_B) extends T_A[(T_B,T_A[Boolean])]
case class CC_C(a: T_B, b: CC_B) extends T_B
case class CC_D(a: CC_B, b: T_A[CC_B]) extends T_B

val v_a: T_A[(T_B,T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(CC_C(_, _), CC_B(_))) => 0 
  case CC_B(CC_C(CC_D(_, _), CC_B(_))) => 1 
  case CC_B(CC_D(CC_B(_), _)) => 2 
}
}
// This is not matched: CC_A()
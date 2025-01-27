package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: CC_A, b: T_A[CC_A]) extends T_A[CC_A]
case class CC_C(a: CC_A, b: T_A[T_A[CC_A]]) extends T_A[CC_A]
case class CC_D(a: Boolean, b: T_B) extends T_B
case class CC_E(a: T_A[CC_C], b: Boolean) extends T_B
case class CC_F(a: T_B, b: CC_D) extends T_B

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_B(CC_A(), _)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(CC_A(), CC_C(_, _))
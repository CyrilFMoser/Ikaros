package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B)]) extends T_A[(T_B,T_A[T_B])]
case class CC_B(a: ((Boolean,T_B),T_A[CC_A]), b: T_B) extends T_A[(T_B,T_A[T_B])]
case class CC_C(a: T_A[CC_A], b: CC_B, c: (T_A[CC_A],T_B)) extends T_A[(T_B,T_A[T_B])]
case class CC_D(a: Int) extends T_B
case class CC_E(a: CC_A, b: CC_A) extends T_B
case class CC_F(a: CC_B, b: CC_E, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
  case CC_E(_, CC_A(_)) => 1 
  case CC_F(_, _, _) => 2 
}
}
// This is not matched: CC_D(_)
package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_B[Boolean],T_A[Boolean])) extends T_A[T_B[T_B[Boolean]]]
case class CC_B(a: T_B[CC_A], b: T_B[T_B[CC_A]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_C(a: CC_B, b: T_B[Boolean]) extends T_A[T_B[T_B[Boolean]]]
case class CC_D(a: CC_A) extends T_B[CC_C]
case class CC_E[C]() extends T_B[C]
case class CC_F(a: CC_D, b: CC_A, c: Boolean) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_)) => 0 
  case CC_E() => 1 
  case CC_F(CC_D(_), CC_A((_,_)), _) => 2 
}
}
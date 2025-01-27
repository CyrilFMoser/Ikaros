package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]], b: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_C(a: T_B[CC_B], b: (CC_A,Boolean)) extends T_B[T_B[T_A[CC_A]]]
case class CC_D(a: T_A[Boolean], b: Int) extends T_B[T_B[T_A[CC_A]]]
case class CC_E[C]() extends T_B[C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
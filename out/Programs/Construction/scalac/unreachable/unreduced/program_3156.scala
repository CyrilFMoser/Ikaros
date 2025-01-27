package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, Boolean], T_A], c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: CC_A, b: Boolean, c: (CC_A,CC_A)) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_C, b: CC_A, c: T_B[C, C]) extends T_B[C, Boolean]
case class CC_E[D]() extends T_B[D, Boolean]
case class CC_F() extends T_B[T_B[Int, Boolean], Boolean]

val v_a: T_B[CC_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
}
}
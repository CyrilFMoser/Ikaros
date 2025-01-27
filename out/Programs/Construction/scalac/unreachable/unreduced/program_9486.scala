package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_B[T_A, T_B[T_A, T_A]], c: T_B[Boolean, T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (Char,CC_B), b: T_B[CC_A, T_B[Boolean, T_A]]) extends T_A
case class CC_D[C](a: T_A, b: CC_C, c: C) extends T_B[C, T_B[CC_B, Int]]
case class CC_E[D](a: Boolean) extends T_B[D, T_B[CC_B, Int]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C((_,CC_B()), _)
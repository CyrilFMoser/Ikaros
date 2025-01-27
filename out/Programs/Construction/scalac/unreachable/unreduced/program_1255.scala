package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_B[T_A, T_B[CC_A, CC_A]]) extends T_A
case class CC_C[C](a: CC_B, b: C) extends T_A
case class CC_D() extends T_B[Char, CC_A]
case class CC_E[D](a: CC_D) extends T_B[(Int,CC_D), D]
case class CC_F(a: CC_C[CC_D]) extends T_B[Char, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_B(_, _), _) => 1 
}
}
// This is not matched: CC_B(_, _)
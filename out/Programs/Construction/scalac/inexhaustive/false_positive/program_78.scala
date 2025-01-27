package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_E[F, E]() extends T_B[F, E]
case class CC_F[H, G](a: T_B[H, G]) extends T_B[H, G]

val v_a: CC_F[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_F(CC_E()) => 0 
}
}
// This is not matched: CC_A(CC_B(_, _), _)
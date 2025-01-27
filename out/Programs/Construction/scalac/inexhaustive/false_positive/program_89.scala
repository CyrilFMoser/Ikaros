package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: ((T_A,T_A),T_B[T_A, T_A])) extends T_A
case class CC_E[F, E]() extends T_B[F, E]
case class CC_F[H, G]() extends T_B[H, G]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_F())) => 0 
}
}
// This is not matched: CC_B(CC_A())
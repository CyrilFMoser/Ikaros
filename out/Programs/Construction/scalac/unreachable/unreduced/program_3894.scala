package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F], b: T_A[E, T_A[E, E]]) extends T_A[F, E]
case class CC_B[G](a: Byte, b: T_B[G, G]) extends T_A[G, T_A[CC_A[G, G], G]]
case class CC_C[H](a: T_B[H, H], b: T_B[H, Boolean]) extends T_B[H, Boolean]

val v_a: T_A[Boolean, T_A[CC_A[Boolean, Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, CC_C(_, _)), CC_A(_, CC_A(_, _))) => 0 
  case CC_B(_, CC_C(CC_C(_, _), CC_C(_, _))) => 1 
}
}
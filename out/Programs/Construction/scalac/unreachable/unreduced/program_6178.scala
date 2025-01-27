package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[Char]]
case class CC_B(a: CC_A, b: (CC_A,CC_A)) extends T_A[T_A[Char]]
case class CC_C(a: T_A[T_A[CC_A]], b: Char) extends T_A[T_A[Char]]
case class CC_D[E, D](a: D) extends T_B[D, E]
case class CC_E[F, G]() extends T_B[G, F]
case class CC_F[H](a: CC_C, b: T_B[T_B[H, H], H]) extends T_B[T_B[H, H], H]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(CC_A(), _)
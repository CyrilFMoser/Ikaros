package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[T_B[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_B[F, G]() extends T_B[F, G]
case class CC_C[H, I](a: T_A[T_A[H, Char], H], b: T_B[T_B[H, H], H]) extends T_B[I, H]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
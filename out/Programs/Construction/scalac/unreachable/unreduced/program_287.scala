package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_A[T_A[Byte, Boolean], Boolean], E]
case class CC_B[F, G](a: CC_A[G], b: T_A[T_B[F, G], G], c: F) extends T_B[F, G]
case class CC_C[I, H](a: T_B[H, H], b: I) extends T_B[I, H]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _)) => 0 
  case CC_A(CC_C(_, _)) => 1 
}
}
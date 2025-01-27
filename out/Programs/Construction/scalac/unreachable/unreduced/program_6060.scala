package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F](a: F, b: T_A[F, F], c: T_A[F, T_B[F, F]]) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: T_A[T_A[G, G], T_B[T_A[G, G], T_A[G, G]]], b: CC_B[G], c: G) extends T_B[G, T_B[(Byte,Int), Boolean]]
case class CC_D[H](a: Boolean, b: CC_B[H]) extends T_B[H, T_B[(Byte,Int), Boolean]]
case class CC_E[I](a: CC_D[I], b: T_A[I, T_B[I, I]]) extends T_B[I, T_B[(Byte,Int), Boolean]]

val v_a: T_B[Int, T_B[(Byte,Int), Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E(CC_D(true, CC_B(_, _, _)), _) => 1 
  case CC_E(CC_D(false, CC_B(_, _, _)), _) => 2 
}
}
// This is not matched: CC_D(_, _)
package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: F, b: T_B[F, E]) extends T_A[E, F]
case class CC_B[G](a: G, b: T_A[G, G], c: T_A[G, G]) extends T_A[G, CC_A[T_A[(Boolean,Int), Byte], T_A[Int, Boolean]]]
case class CC_C[H](a: CC_B[H]) extends T_A[H, CC_A[T_A[(Boolean,Int), Byte], T_A[Int, Boolean]]]
case class CC_D[I](a: T_B[I, CC_C[I]], b: CC_C[I]) extends T_B[I, CC_B[I]]
case class CC_E[J](a: T_B[J, CC_B[J]]) extends T_B[J, CC_B[J]]

val v_a: T_B[Char, CC_B[Char]] = null
val v_b: Int = v_a match{
  case CC_E(CC_D(_, _)) => 0 
  case CC_E(CC_E(_)) => 1 
}
}
// This is not matched: CC_D(_, CC_C(_))
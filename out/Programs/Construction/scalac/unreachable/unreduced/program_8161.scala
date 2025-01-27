package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, T_B[T_B[Char, Int], T_A[Boolean, Byte]]]
case class CC_B[F](a: T_A[F, F], b: T_B[F, F], c: T_A[F, F]) extends T_A[F, T_B[T_B[Char, Int], T_A[Boolean, Byte]]]
case class CC_C[G](a: G, b: T_A[G, G], c: Int) extends T_A[G, T_B[T_B[Char, Int], T_A[Boolean, Byte]]]
case class CC_D[I, H](a: I, b: Int, c: CC_C[H]) extends T_B[H, I]
case class CC_E[K, J](a: T_B[K, K]) extends T_B[K, J]

val v_a: T_A[Boolean, T_B[T_B[Char, Int], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _)) => 0 
  case CC_A(CC_E(CC_D(_, _, _))) => 1 
  case CC_A(CC_E(CC_E(_))) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(_, _, _) => 4 
}
}
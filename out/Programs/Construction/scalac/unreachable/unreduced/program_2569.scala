package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[T_B[Boolean, Int], T_A[Char, Char]], E]
case class CC_B[F](a: F, b: F, c: T_A[F, F]) extends T_A[T_A[T_B[Boolean, Int], T_A[Char, Char]], F]
case class CC_C[G](a: G) extends T_A[T_A[T_B[Boolean, Int], T_A[Char, Char]], G]
case class CC_D[I, H](a: T_B[I, H], b: T_B[H, I]) extends T_B[I, H]
case class CC_E[J, K](a: J, b: T_B[CC_A[Char], K], c: (CC_A[Boolean],CC_D[Byte, Byte])) extends T_B[K, J]

val v_a: T_A[T_A[T_B[Boolean, Int], T_A[Char, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}
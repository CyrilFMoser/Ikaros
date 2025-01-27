package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, E]) extends T_A[F, E]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C[J, I](a: T_A[J, J], b: T_B[J, J]) extends T_A[I, J]
case class CC_D[K](a: T_A[K, K], b: Int, c: CC_B[K, K]) extends T_B[CC_B[CC_A[Int, Int], T_A[Byte, Byte]], K]
case class CC_E[L, M]() extends T_B[CC_B[CC_A[Int, Int], T_A[Byte, Byte]], L]
case class CC_F() extends T_B[CC_B[CC_A[Int, Int], T_A[Byte, Byte]], CC_D[T_A[Char, Char]]]

val v_a: T_A[T_B[CC_B[CC_A[Int, Int], T_A[Byte, Byte]], CC_D[T_A[Char, Char]]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_), _) => 2 
  case CC_C(CC_B(), _) => 3 
}
}
// This is not matched: CC_C(CC_C(_, _), _)
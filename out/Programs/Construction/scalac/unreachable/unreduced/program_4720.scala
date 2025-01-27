package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_A[Char, Byte], T_B[Char, Int]]]
case class CC_B[F](a: T_B[F, F], b: Int, c: F) extends T_A[F, T_B[T_A[Char, Byte], T_B[Char, Int]]]
case class CC_C[G](a: Byte) extends T_B[G, CC_A[G]]
case class CC_D() extends T_B[Char, CC_A[Char]]
case class CC_E(a: CC_B[CC_C[CC_D]]) extends T_B[(T_B[CC_D, CC_D],CC_D), CC_A[(T_B[CC_D, CC_D],CC_D)]]

val v_a: T_A[T_B[Char, CC_A[Char]], T_B[T_A[Char, Byte], T_B[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_C(_)) => 1 
}
}
// This is not matched: CC_B(_, _, CC_D())
package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: (T_A[Int, Byte],Byte), c: T_B[E, E]) extends T_A[T_B[E, E], E]
case class CC_B[F](a: (T_A[Int, Boolean],T_A[Byte, Byte]), b: T_A[T_B[F, F], F]) extends T_A[T_B[F, F], F]
case class CC_C[G](a: Int, b: T_A[T_B[G, G], G]) extends T_B[T_A[T_B[CC_A[Int], CC_A[Int]], CC_A[Int]], G]
case class CC_D[H](a: T_B[H, H], b: Char, c: CC_C[H]) extends T_B[T_A[T_B[CC_A[Int], CC_A[Int]], CC_A[Int]], H]

val v_a: T_B[T_A[T_B[CC_A[Int], CC_A[Int]], CC_A[Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(12, CC_A(_, _, _)) => 0 
  case CC_C(12, CC_B(_, CC_A(_, _, _))) => 1 
  case CC_C(12, CC_B(_, CC_B(_, _))) => 2 
  case CC_C(_, CC_A(_, _, _)) => 3 
  case CC_C(_, CC_B(_, CC_A(_, _, _))) => 4 
  case CC_C(_, CC_B(_, CC_B(_, _))) => 5 
  case CC_D(_, _, _) => 6 
}
}
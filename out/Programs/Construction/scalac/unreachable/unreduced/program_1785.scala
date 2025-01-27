package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Byte) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, F]) extends T_A[F, T_B[F, F]]
case class CC_C[G]() extends T_A[G, T_B[G, G]]
case class CC_D(a: T_A[T_A[(Byte,Boolean), Byte], T_B[T_A[(Byte,Boolean), Byte], T_A[(Byte,Boolean), Byte]]], b: Int) extends T_B[T_B[T_A[Int, Byte], CC_A[Char]], CC_A[Char]]
case class CC_E[H](a: T_A[H, T_B[H, H]], b: Int) extends T_B[T_A[H, T_B[H, H]], H]

val v_a: T_B[T_B[T_A[Int, Byte], CC_A[Char]], CC_A[Char]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _) => 0 
  case CC_D(CC_C(), _) => 1 
}
}
// This is not matched: CC_D(CC_B(_), _)
package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Boolean) extends T_A[E, Int]
case class CC_B(a: Char, b: T_A[CC_A[Int], Int], c: T_A[Byte, Int]) extends T_A[T_A[T_A[Char, Byte], CC_A[Byte]], Int]
case class CC_C(a: Byte, b: Int, c: T_A[CC_B, Byte]) extends T_A[T_A[T_A[Char, Byte], CC_A[Byte]], Int]
case class CC_D[F, G](a: G, b: Byte) extends T_B[G, F]
case class CC_E[H]() extends T_B[T_B[H, H], H]
case class CC_F[I]() extends T_B[T_B[I, I], I]

val v_a: T_A[T_A[T_A[Char, Byte], CC_A[Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, 0), _) => 0 
  case CC_A(CC_D(_, _), _) => 1 
  case CC_B(_, CC_A(_, _), _) => 2 
}
}
// This is not matched: CC_C(_, _, _)
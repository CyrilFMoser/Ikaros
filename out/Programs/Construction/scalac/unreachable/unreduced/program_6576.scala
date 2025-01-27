package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[T_B[D, Int]]) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C[F](a: (Byte,CC_B[Boolean]), b: Int) extends T_A[F]
case class CC_D[G]() extends T_B[T_A[G], G]
case class CC_E[H](a: T_B[T_A[H], H], b: CC_A[H]) extends T_B[T_A[H], H]
case class CC_F[I](a: T_B[I, I], b: CC_A[I], c: I) extends T_B[T_A[I], I]

val v_a: T_B[T_A[Char], Char] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), CC_A(CC_A(_))) => 1 
  case CC_E(CC_E(_, _), CC_A(CC_A(_))) => 2 
  case CC_E(CC_F(_, CC_A(_), _), CC_A(CC_A(_))) => 3 
  case CC_E(CC_D(), CC_A(CC_B(_))) => 4 
  case CC_E(CC_E(_, _), CC_A(CC_B(_))) => 5 
  case CC_E(CC_D(), CC_A(CC_C(_, _))) => 6 
  case CC_E(CC_E(_, _), CC_A(CC_C(_, _))) => 7 
  case CC_E(CC_F(_, CC_A(_), _), CC_A(CC_C(_, _))) => 8 
  case CC_F(_, _, _) => 9 
}
}
// This is not matched: CC_E(CC_F(_, CC_A(_), _), CC_A(CC_B(_)))
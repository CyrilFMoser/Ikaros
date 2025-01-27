package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[Int, E]) extends T_A[T_B[T_B[Boolean, Int], T_A[Int, (Char,Byte)]], E]
case class CC_B[F, G](a: T_B[F, F]) extends T_B[F, G]
case class CC_C[H](a: CC_B[H, H], b: CC_A[H]) extends T_B[T_B[Boolean, CC_A[Byte]], H]
case class CC_D[I](a: CC_A[I], b: CC_B[I, I], c: CC_A[I]) extends T_B[T_B[Boolean, CC_A[Byte]], I]

val v_a: T_B[T_B[Boolean, CC_A[Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_D(_, _, _))) => 1 
  case CC_B(CC_C(CC_B(_), _)) => 2 
  case CC_B(CC_D(CC_A(_), CC_B(_), CC_A(_))) => 3 
  case CC_C(CC_B(_), CC_A(_)) => 4 
  case CC_D(CC_A(_), CC_B(CC_B(_)), _) => 5 
}
}
// This is not matched: CC_B(CC_B(CC_C(_, _)))
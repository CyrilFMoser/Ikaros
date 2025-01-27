package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: F, b: T_B[T_A[F, F], F], c: Byte) extends T_A[F, E]
case class CC_B[G, H](a: G, b: T_A[G, H]) extends T_A[H, G]
case class CC_C[I](a: T_B[I, I]) extends T_B[T_B[T_A[I, I], T_A[I, I]], I]
case class CC_D[J](a: (T_A[Int, Char],T_A[Byte, Boolean]), b: T_A[J, Byte], c: T_A[J, J]) extends T_B[T_B[T_A[J, J], T_A[J, J]], J]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
}
}
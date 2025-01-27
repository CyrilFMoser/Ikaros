package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F, G](a: T_A[G]) extends T_A[F]
case class CC_D[H](a: Int) extends T_B[Boolean, H]
case class CC_E[I](a: I, b: T_A[I]) extends T_B[T_B[T_A[Byte], T_A[Int]], I]
case class CC_F[J](a: CC_E[J], b: Byte) extends T_B[T_B[T_A[Byte], T_A[Int]], J]

val v_a: T_B[T_B[T_A[Byte], T_A[Int]], Char] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_A(_, _, _)) => 0 
  case CC_E(_, CC_B()) => 1 
  case CC_E(_, CC_C(_)) => 2 
  case CC_F(_, _) => 3 
}
}
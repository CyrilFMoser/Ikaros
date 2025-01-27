package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[T_A[E, F], F], b: T_A[F, E], c: T_A[F, E]) extends T_A[F, E]
case class CC_B[H, G](a: G) extends T_A[G, H]
case class CC_C[I](a: CC_A[I, I], b: T_B[I, I], c: CC_B[I, I]) extends T_B[T_A[CC_A[Byte, Int], T_A[Int, Byte]], I]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_B(_)) => 1 
  case CC_A(_, CC_B(_), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_B(_), CC_B(_)) => 3 
  case CC_B(_) => 4 
}
}
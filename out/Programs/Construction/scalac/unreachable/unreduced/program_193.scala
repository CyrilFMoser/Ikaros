package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Byte, b: Char, c: T_B[F, F]) extends T_A[F, E]
case class CC_B[G, H](a: (CC_A[(Int,Int), Boolean],T_A[Boolean, Byte]), b: T_A[H, G]) extends T_A[G, H]
case class CC_C[I](a: T_A[I, I], b: I, c: Int) extends T_B[I, T_A[I, T_A[I, I]]]
case class CC_D[J](a: J) extends T_B[T_A[T_A[(Char,Char), Byte], Char], J]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _, _))
package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, (Boolean,Char)], b: Byte, c: Char) extends T_A[F, E]
case class CC_B[H, G](a: H, b: G, c: T_A[G, ((Boolean,Byte),(Byte,Int))]) extends T_A[G, H]
case class CC_C[I](a: I, b: I) extends T_A[T_B[I, I], I]
case class CC_D[J](a: (T_A[Char, Char],T_A[Char, (Byte,Char)]), b: T_A[J, J], c: CC_C[J]) extends T_B[J, T_A[(Int,Char), CC_B[Int, (Boolean,Byte)]]]
case class CC_E[K]() extends T_B[K, T_A[(Int,Char), CC_B[Int, (Boolean,Byte)]]]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
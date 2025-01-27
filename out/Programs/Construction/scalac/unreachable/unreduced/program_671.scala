package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Byte, E]
case class CC_B[F](a: T_A[Byte, F]) extends T_A[Byte, F]
case class CC_C[G, H](a: (T_A[Char, Byte],T_A[Byte, Byte]), b: T_A[H, G], c: G) extends T_B[G, H]
case class CC_D[I](a: Int, b: T_A[I, CC_C[I, I]], c: I) extends T_B[CC_C[T_A[Byte, Char], T_A[Int, Char]], I]
case class CC_E[J, K](a: T_B[K, T_A[Byte, K]], b: T_B[K, K], c: Int) extends T_B[K, J]

val v_a: T_B[CC_C[T_A[Byte, Char], T_A[Int, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_C((_,_), _, CC_C(_, _, _)) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E(_, _, _) => 2 
}
}
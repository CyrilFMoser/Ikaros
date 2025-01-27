package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, T_B[E, E]]]
case class CC_B[F]() extends T_A[F, T_A[F, T_B[F, F]]]
case class CC_C[H, G](a: H) extends T_A[G, H]
case class CC_D[I](a: CC_C[I, CC_A[I]], b: Char, c: I) extends T_B[CC_C[I, I], I]
case class CC_E[J](a: CC_C[J, J], b: ((Byte,(Char,Int)),T_B[(Boolean,Byte), Boolean]), c: Char) extends T_B[CC_C[J, J], J]
case class CC_F[K](a: (Char,T_A[(Int,Char), Int]), b: CC_D[K]) extends T_B[CC_C[K, K], K]

val v_a: T_A[Int, T_A[Int, T_B[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_C(_)) => 1 
}
}
// This is not matched: CC_B()
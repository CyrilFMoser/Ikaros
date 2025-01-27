package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int, b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B() extends T_A[CC_A[(Int,Byte)]]
case class CC_C[E](a: ((CC_B,CC_B),T_A[CC_B]), b: T_A[E]) extends T_A[E]
case class CC_D[F](a: T_B[F, F], b: CC_A[F]) extends T_B[F, T_A[F]]
case class CC_E[G](a: (T_A[Char],T_A[(Boolean,Boolean)]), b: G) extends T_B[G, T_A[G]]
case class CC_F[H]() extends T_B[H, CC_C[H]]

val v_a: T_A[CC_A[(Int,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(((_,_),CC_A(_, _, _)), _) => 2 
}
}
// This is not matched: CC_C(((_,_),CC_C(_, _)), _)
package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Char, b: T_A[E, E]) extends T_A[F, E]
case class CC_B[H, G](a: Int, b: T_A[G, Byte], c: (T_A[Int, Byte],(Int,(Int,Byte)))) extends T_A[H, G]
case class CC_C[J, I](a: T_B[I, J], b: T_A[I, I], c: J) extends T_A[J, I]
case class CC_D[K](a: T_A[K, K], b: T_A[K, K]) extends T_B[CC_B[K, K], K]
case class CC_E[L, M](a: T_B[CC_B[L, L], L], b: M) extends T_B[CC_B[L, L], L]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_A(_, CC_C(_, _, _)) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_B(_, _, (_,_))
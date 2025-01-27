package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E], c: T_A[E, E]) extends T_A[E, T_A[Int, T_A[Byte, Int]]]
case class CC_B[F]() extends T_A[F, T_A[Int, T_A[Byte, Int]]]
case class CC_C[G](a: CC_A[G], b: T_B[G, ((Char,Byte),Char)]) extends T_A[G, T_A[Int, T_A[Byte, Int]]]
case class CC_D[H, I](a: CC_C[CC_C[H]], b: H, c: CC_C[I]) extends T_B[I, H]
case class CC_E[J, K](a: CC_D[J, K], b: Byte, c: (Char,T_B[Byte, Byte])) extends T_B[K, J]
case class CC_F[L](a: L, b: L) extends T_B[L, Byte]

val v_a: T_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_C(CC_A(_, _, _), CC_D(_, _, _))) => 0 
  case CC_D(_, _, CC_C(CC_A(_, _, _), CC_E(_, _, _))) => 1 
  case CC_E(_, _, ('x',CC_D(_, _, _))) => 2 
  case CC_E(_, _, ('x',CC_E(_, _, _))) => 3 
  case CC_E(_, _, ('x',CC_F(_, _))) => 4 
  case CC_E(_, _, (_,CC_D(_, _, _))) => 5 
  case CC_E(_, _, (_,CC_E(_, _, _))) => 6 
  case CC_E(_, _, (_,CC_F(_, _))) => 7 
}
}
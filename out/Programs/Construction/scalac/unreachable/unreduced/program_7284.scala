package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, T_B[E, E]], b: E, c: Int) extends T_A[E, T_A[T_A[Char, Boolean], ((Char,Char),Char)]]
case class CC_B[F](a: Boolean, b: T_A[T_B[F, F], F], c: CC_A[F]) extends T_A[F, T_A[T_A[Char, Boolean], ((Char,Char),Char)]]
case class CC_C[G, H](a: T_B[H, G], b: T_A[H, G]) extends T_B[H, G]
case class CC_D[I](a: CC_C[Char, I], b: (Byte,CC_A[Char]), c: T_B[CC_A[Boolean], I]) extends T_B[I, CC_A[CC_C[Char, Char]]]

val v_a: T_A[Int, T_A[T_A[Char, Boolean], ((Char,Char),Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, CC_A(CC_C(_, _), 12, _)) => 1 
}
}
// This is not matched: CC_B(_, _, CC_A(CC_C(_, _), _, _))
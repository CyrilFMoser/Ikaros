package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Byte], T_B[(Char,Char)]], b: T_A[T_A[Int, Int], T_B[Boolean]], c: T_A[(Char,Int), T_B[Byte]]) extends T_A[T_A[T_A[Int, Char], Char], T_A[Int, T_A[Int, Int]]]
case class CC_B(a: T_A[Int, T_A[Byte, CC_A]], b: (Byte,T_B[Int]), c: CC_A) extends T_A[T_A[T_A[Int, Char], Char], T_A[Int, T_A[Int, Int]]]
case class CC_C(a: CC_B, b: T_B[(Char,CC_A)], c: Char) extends T_A[T_A[T_A[Int, Char], Char], T_A[Int, T_A[Int, Int]]]
case class CC_D[D](a: (CC_A,CC_B), b: CC_A, c: T_B[D]) extends T_B[D]
case class CC_E[E](a: T_B[E]) extends T_B[E]
case class CC_F[F](a: CC_D[F], b: CC_D[F]) extends T_B[F]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D((CC_A(_, _, _),CC_B(_, _, _)), _, CC_D((_,_), CC_A(_, _, _), CC_D(_, _, _))) => 0 
  case CC_D((CC_A(_, _, _),CC_B(_, _, _)), _, CC_D((_,_), CC_A(_, _, _), CC_E(_))) => 1 
  case CC_D((CC_A(_, _, _),CC_B(_, _, _)), _, CC_D((_,_), CC_A(_, _, _), CC_F(_, _))) => 2 
  case CC_D((CC_A(_, _, _),CC_B(_, _, _)), _, CC_E(CC_D(_, _, _))) => 3 
  case CC_D((CC_A(_, _, _),CC_B(_, _, _)), _, CC_E(CC_E(_))) => 4 
  case CC_D((CC_A(_, _, _),CC_B(_, _, _)), _, CC_E(CC_F(_, _))) => 5 
  case CC_D((CC_A(_, _, _),CC_B(_, _, _)), _, CC_F(_, CC_D(_, _, _))) => 6 
  case CC_E(CC_D((_,_), CC_A(_, _, _), CC_D(_, _, _))) => 7 
  case CC_E(CC_D((_,_), CC_A(_, _, _), CC_E(_))) => 8 
  case CC_E(CC_D((_,_), CC_A(_, _, _), CC_F(_, _))) => 9 
  case CC_E(CC_E(CC_E(_))) => 10 
  case CC_E(CC_E(CC_F(_, _))) => 11 
  case CC_E(CC_F(CC_D(_, _, _), _)) => 12 
  case CC_F(CC_D((_,_), CC_A(_, _, _), CC_D(_, _, _)), CC_D((_,_), _, CC_D(_, _, _))) => 13 
  case CC_F(CC_D((_,_), CC_A(_, _, _), CC_D(_, _, _)), CC_D((_,_), _, CC_E(_))) => 14 
  case CC_F(CC_D((_,_), CC_A(_, _, _), CC_D(_, _, _)), CC_D((_,_), _, CC_F(_, _))) => 15 
  case CC_F(CC_D((_,_), CC_A(_, _, _), CC_E(_)), CC_D((_,_), _, CC_D(_, _, _))) => 16 
  case CC_F(CC_D((_,_), CC_A(_, _, _), CC_E(_)), CC_D((_,_), _, CC_E(_))) => 17 
  case CC_F(CC_D((_,_), CC_A(_, _, _), CC_E(_)), CC_D((_,_), _, CC_F(_, _))) => 18 
  case CC_F(CC_D((_,_), CC_A(_, _, _), CC_F(_, _)), CC_D((_,_), _, CC_D(_, _, _))) => 19 
  case CC_F(CC_D((_,_), CC_A(_, _, _), CC_F(_, _)), CC_D((_,_), _, CC_E(_))) => 20 
  case CC_F(CC_D((_,_), CC_A(_, _, _), CC_F(_, _)), CC_D((_,_), _, CC_F(_, _))) => 21 
}
}
// This is not matched: CC_E(CC_E(CC_D(_, _, _)))
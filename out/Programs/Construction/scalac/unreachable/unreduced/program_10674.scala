package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_B[D]) extends T_A[Char, D]
case class CC_B(a: T_A[Char, T_A[Byte, Char]], b: CC_A[Boolean]) extends T_A[Char, (T_B[Char],CC_A[Int])]
case class CC_C(a: Char, b: Int, c: T_A[(Char,CC_B), Char]) extends T_A[Char, T_A[Char, T_B[CC_B]]]
case class CC_D[E](a: T_B[E], b: E, c: T_B[Char]) extends T_B[E]
case class CC_E[F](a: CC_A[F], b: F) extends T_B[F]
case class CC_F(a: T_B[Boolean]) extends T_B[CC_E[CC_D[CC_B]]]

val v_a: T_B[CC_E[CC_D[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _, _), CC_E(_, _), CC_D(CC_D(_, _, _), _, CC_D(_, _, _))) => 0 
  case CC_D(CC_D(_, _, _), CC_E(_, _), CC_D(CC_E(_, _), _, CC_D(_, _, _))) => 1 
  case CC_D(CC_D(_, _, _), CC_E(_, _), CC_D(CC_D(_, _, _), _, CC_E(_, _))) => 2 
  case CC_D(CC_D(_, _, _), CC_E(_, _), CC_D(CC_E(_, _), _, CC_E(_, _))) => 3 
  case CC_D(CC_D(_, _, _), CC_E(_, _), CC_E(CC_A(_, _, _), _)) => 4 
  case CC_D(CC_E(_, _), CC_E(_, _), CC_D(CC_D(_, _, _), _, CC_D(_, _, _))) => 5 
  case CC_D(CC_E(_, _), CC_E(_, _), CC_D(CC_E(_, _), _, CC_D(_, _, _))) => 6 
  case CC_D(CC_E(_, _), CC_E(_, _), CC_D(CC_D(_, _, _), _, CC_E(_, _))) => 7 
  case CC_D(CC_E(_, _), CC_E(_, _), CC_D(CC_E(_, _), _, CC_E(_, _))) => 8 
  case CC_D(CC_E(_, _), CC_E(_, _), CC_E(CC_A(_, _, _), _)) => 9 
  case CC_D(CC_F(_), CC_E(_, _), CC_D(CC_D(_, _, _), _, CC_D(_, _, _))) => 10 
  case CC_D(CC_F(_), CC_E(_, _), CC_D(CC_E(_, _), _, CC_D(_, _, _))) => 11 
  case CC_D(CC_F(_), CC_E(_, _), CC_D(CC_D(_, _, _), _, CC_E(_, _))) => 12 
  case CC_D(CC_F(_), CC_E(_, _), CC_D(CC_E(_, _), _, CC_E(_, _))) => 13 
  case CC_D(CC_F(_), CC_E(_, _), CC_E(CC_A(_, _, _), _)) => 14 
  case CC_E(_, CC_E(_, _)) => 15 
  case CC_F(CC_D(CC_D(_, _, _), _, _)) => 16 
  case CC_F(CC_D(CC_E(_, _), _, _)) => 17 
  case CC_F(CC_E(CC_A(_, _, _), true)) => 18 
  case CC_F(CC_E(CC_A(_, _, _), false)) => 19 
}
}
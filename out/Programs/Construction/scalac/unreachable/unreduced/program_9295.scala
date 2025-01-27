package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_A[Char],T_B[Int, Int]), b: T_A[D]) extends T_A[D]
case class CC_B[E](a: E, b: E) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_A[F]
case class CC_D[G](a: Int, b: CC_A[G], c: T_A[G]) extends T_B[Char, G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),_), CC_A(_, _)) => 0 
  case CC_A((CC_A(_, _),_), CC_B(_, 'x')) => 1 
  case CC_A((CC_A(_, _),_), CC_B(_, _)) => 2 
  case CC_A((CC_A(_, _),_), CC_C(CC_A(_, _))) => 3 
  case CC_A((CC_A(_, _),_), CC_C(CC_B(_, _))) => 4 
  case CC_A((CC_A(_, _),_), CC_C(CC_C(_))) => 5 
  case CC_A((CC_B(_, _),_), CC_A(_, _)) => 6 
  case CC_A((CC_B(_, _),_), CC_B(_, 'x')) => 7 
  case CC_A((CC_B(_, _),_), CC_B(_, _)) => 8 
  case CC_A((CC_B(_, _),_), CC_C(CC_A(_, _))) => 9 
  case CC_A((CC_B(_, _),_), CC_C(CC_B(_, _))) => 10 
  case CC_A((CC_B(_, _),_), CC_C(CC_C(_))) => 11 
  case CC_A((CC_C(_),_), CC_A(_, _)) => 12 
  case CC_A((CC_C(_),_), CC_B(_, 'x')) => 13 
  case CC_A((CC_C(_),_), CC_B(_, _)) => 14 
  case CC_A((CC_C(_),_), CC_C(CC_A(_, _))) => 15 
  case CC_A((CC_C(_),_), CC_C(CC_B(_, _))) => 16 
  case CC_A((CC_C(_),_), CC_C(CC_C(_))) => 17 
  case CC_B(_, _) => 18 
  case CC_C(CC_A(_, _)) => 19 
  case CC_C(CC_B('x', _)) => 20 
  case CC_C(CC_B(_, _)) => 21 
  case CC_C(CC_C(CC_A(_, _))) => 22 
  case CC_C(CC_C(CC_B(_, _))) => 23 
  case CC_C(CC_C(CC_C(_))) => 24 
}
}
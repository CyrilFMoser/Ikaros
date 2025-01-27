package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: CC_A[T_B[E, E]], b: CC_A[E], c: E) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_A[F]
case class CC_D[G](a: G) extends T_B[G, CC_B[(Char,Char)]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _, _)) => 1 
  case CC_A(_, _, CC_C(CC_A(_, _, _))) => 2 
  case CC_A(_, _, CC_C(CC_B(_, _, _))) => 3 
  case CC_A(_, _, CC_C(CC_C(_))) => 4 
  case CC_B(CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _)), _) => 5 
  case CC_B(CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, CC_B(_, _, _)), _) => 6 
  case CC_B(CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, CC_C(_)), _) => 7 
  case CC_B(CC_A(_, _, CC_B(_, _, _)), CC_A(_, _, CC_A(_, _, _)), _) => 8 
  case CC_B(CC_A(_, _, CC_B(_, _, _)), CC_A(_, _, CC_B(_, _, _)), _) => 9 
  case CC_B(CC_A(_, _, CC_B(_, _, _)), CC_A(_, _, CC_C(_)), _) => 10 
  case CC_B(CC_A(_, _, CC_C(_)), CC_A(_, _, CC_A(_, _, _)), _) => 11 
  case CC_B(CC_A(_, _, CC_C(_)), CC_A(_, _, CC_B(_, _, _)), _) => 12 
  case CC_B(CC_A(_, _, CC_C(_)), CC_A(_, _, CC_C(_)), _) => 13 
  case CC_C(CC_A(_, _, CC_A(_, _, _))) => 14 
  case CC_C(CC_A(_, _, CC_B(_, _, _))) => 15 
  case CC_C(CC_A(_, _, CC_C(_))) => 16 
  case CC_C(CC_B(CC_A(_, _, _), _, _)) => 17 
  case CC_C(CC_C(CC_A(_, _, _))) => 18 
  case CC_C(CC_C(CC_B(_, _, _))) => 19 
  case CC_C(CC_C(CC_C(_))) => 20 
}
}
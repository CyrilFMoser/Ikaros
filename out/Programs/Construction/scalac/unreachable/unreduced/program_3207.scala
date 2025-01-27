package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: (T_A[(Byte,Boolean)],CC_B[Char])) extends T_B[Byte, F]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_B(CC_B(CC_A(_), CC_A(_)), CC_A(_)) => 2 
  case CC_B(CC_B(CC_B(_, _), CC_A(_)), CC_A(_)) => 3 
  case CC_B(CC_B(CC_A(_), CC_B(_, _)), CC_A(_)) => 4 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), CC_A(_)) => 5 
  case CC_B(CC_A(_), CC_B(CC_A(_), CC_A(_))) => 6 
  case CC_B(CC_B(CC_A(_), CC_A(_)), CC_B(CC_A(_), CC_A(_))) => 7 
  case CC_B(CC_B(CC_B(_, _), CC_A(_)), CC_B(CC_A(_), CC_A(_))) => 8 
  case CC_B(CC_B(CC_A(_), CC_B(_, _)), CC_B(CC_A(_), CC_A(_))) => 9 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), CC_B(CC_A(_), CC_A(_))) => 10 
  case CC_B(CC_A(_), CC_B(CC_B(_, _), CC_A(_))) => 11 
  case CC_B(CC_B(CC_A(_), CC_A(_)), CC_B(CC_B(_, _), CC_A(_))) => 12 
  case CC_B(CC_B(CC_B(_, _), CC_A(_)), CC_B(CC_B(_, _), CC_A(_))) => 13 
  case CC_B(CC_B(CC_A(_), CC_B(_, _)), CC_B(CC_B(_, _), CC_A(_))) => 14 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), CC_B(CC_B(_, _), CC_A(_))) => 15 
  case CC_B(CC_A(_), CC_B(CC_A(_), CC_B(_, _))) => 16 
  case CC_B(CC_B(CC_A(_), CC_A(_)), CC_B(CC_A(_), CC_B(_, _))) => 17 
  case CC_B(CC_B(CC_B(_, _), CC_A(_)), CC_B(CC_A(_), CC_B(_, _))) => 18 
  case CC_B(CC_B(CC_A(_), CC_B(_, _)), CC_B(CC_A(_), CC_B(_, _))) => 19 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), CC_B(CC_A(_), CC_B(_, _))) => 20 
  case CC_B(CC_A(_), CC_B(CC_B(_, _), CC_B(_, _))) => 21 
  case CC_B(CC_B(CC_A(_), CC_A(_)), CC_B(CC_B(_, _), CC_B(_, _))) => 22 
  case CC_B(CC_B(CC_B(_, _), CC_A(_)), CC_B(CC_B(_, _), CC_B(_, _))) => 23 
  case CC_B(CC_B(CC_A(_), CC_B(_, _)), CC_B(CC_B(_, _), CC_B(_, _))) => 24 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), CC_B(CC_B(_, _), CC_B(_, _))) => 25 
}
}
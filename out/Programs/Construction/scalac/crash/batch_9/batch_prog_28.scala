package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[D, E]) extends T_A[C, D]
case class CC_B[G, F](a: T_A[(Byte,Int), G], b: T_A[F, G]) extends T_A[F, G]
case class CC_C[I, H](a: CC_B[I, I]) extends T_A[I, H]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_B(CC_A(_), CC_B(CC_A(_), _)) => 2 
  case CC_B(CC_A(_), CC_B(CC_B(_, _), _)) => 3 
  case CC_B(CC_A(_), CC_B(CC_C(_), _)) => 4 
  case CC_B(CC_A(_), CC_C(CC_B(_, _))) => 5 
  case CC_B(CC_B(CC_A(_), _), CC_A(_)) => 6 
  case CC_B(CC_B(CC_A(_), _), CC_B(CC_A(_), _)) => 7 
  case CC_B(CC_B(CC_A(_), _), CC_B(CC_B(_, _), _)) => 8 
  case CC_B(CC_B(CC_A(_), _), CC_B(CC_C(_), _)) => 9 
  case CC_B(CC_B(CC_A(_), _), CC_C(CC_B(_, _))) => 10 
  case CC_B(CC_B(CC_B(_, _), _), CC_A(_)) => 11 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_A(_), _)) => 12 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), _)) => 13 
  case CC_B(CC_B(CC_B(_, _), _), CC_C(CC_B(_, _))) => 14 
  case CC_B(CC_B(CC_C(_), _), CC_A(_)) => 15 
  case CC_B(CC_B(CC_C(_), _), CC_B(CC_A(_), _)) => 16 
  case CC_B(CC_B(CC_C(_), _), CC_B(CC_B(_, _), _)) => 17 
  case CC_B(CC_B(CC_C(_), _), CC_B(CC_C(_), _)) => 18 
  case CC_B(CC_B(CC_C(_), _), CC_C(CC_B(_, _))) => 19 
  case CC_B(CC_C(CC_B(_, _)), CC_A(_)) => 20 
  case CC_B(CC_C(CC_B(_, _)), CC_B(CC_A(_), _)) => 21 
  case CC_B(CC_C(CC_B(_, _)), CC_B(CC_B(_, _), _)) => 22 
  case CC_B(CC_C(CC_B(_, _)), CC_B(CC_C(_), _)) => 23 
  case CC_B(CC_C(CC_B(_, _)), CC_C(CC_B(_, _))) => 24 
  case CC_C(CC_B(CC_A(_), CC_A(_))) => 25 
  case CC_C(CC_B(CC_A(_), CC_B(_, _))) => 26 
  case CC_C(CC_B(CC_A(_), CC_C(_))) => 27 
  case CC_C(CC_B(CC_B(_, _), CC_A(_))) => 28 
  case CC_C(CC_B(CC_B(_, _), CC_B(_, _))) => 29 
  case CC_C(CC_B(CC_B(_, _), CC_C(_))) => 30 
  case CC_C(CC_B(CC_C(_), CC_A(_))) => 31 
  case CC_C(CC_B(CC_C(_), CC_B(_, _))) => 32 
  case CC_C(CC_B(CC_C(_), CC_C(_))) => 33 
}
}
// This is not matched: CC_B(CC_B(CC_B(_, _), _), CC_B(CC_C(_), _))
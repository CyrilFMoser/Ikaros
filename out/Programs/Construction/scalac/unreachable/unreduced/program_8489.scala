package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Byte) extends T_A[E, F]
case class CC_B[G, H](a: T_B[G, H], b: T_B[G, H], c: T_A[G, H]) extends T_A[G, H]
case class CC_C[I, J](a: T_A[I, I], b: CC_A[I, I], c: T_A[J, J]) extends T_A[I, J]
case class CC_D[K, L](a: K, b: L) extends T_B[K, CC_B[K, K]]
case class CC_E[M](a: CC_A[M, M], b: T_B[M, CC_B[M, M]]) extends T_B[M, CC_B[M, M]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_A(_), CC_A(_), CC_A(_)) => 1 
  case CC_C(CC_A(_), CC_A(_), CC_B(_, _, CC_A(_))) => 2 
  case CC_C(CC_A(_), CC_A(_), CC_B(_, _, CC_B(_, _, _))) => 3 
  case CC_C(CC_A(_), CC_A(_), CC_B(_, _, CC_C(_, _, _))) => 4 
  case CC_C(CC_A(_), CC_A(_), CC_C(CC_A(_), CC_A(_), _)) => 5 
  case CC_C(CC_A(_), CC_A(_), CC_C(CC_B(_, _, _), CC_A(_), _)) => 6 
  case CC_C(CC_A(_), CC_A(_), CC_C(CC_C(_, _, _), CC_A(_), _)) => 7 
  case CC_C(CC_B(_, _, CC_A(_)), CC_A(_), CC_A(_)) => 8 
  case CC_C(CC_B(_, _, CC_A(_)), CC_A(_), CC_B(_, _, CC_A(_))) => 9 
  case CC_C(CC_B(_, _, CC_A(_)), CC_A(_), CC_B(_, _, CC_B(_, _, _))) => 10 
  case CC_C(CC_B(_, _, CC_A(_)), CC_A(_), CC_B(_, _, CC_C(_, _, _))) => 11 
  case CC_C(CC_B(_, _, CC_A(_)), CC_A(_), CC_C(CC_A(_), CC_A(_), _)) => 12 
  case CC_C(CC_B(_, _, CC_A(_)), CC_A(_), CC_C(CC_B(_, _, _), CC_A(_), _)) => 13 
  case CC_C(CC_B(_, _, CC_A(_)), CC_A(_), CC_C(CC_C(_, _, _), CC_A(_), _)) => 14 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), CC_A(_), CC_A(_)) => 15 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), CC_A(_), CC_B(_, _, CC_A(_))) => 16 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), CC_A(_), CC_B(_, _, CC_B(_, _, _))) => 17 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), CC_A(_), CC_B(_, _, CC_C(_, _, _))) => 18 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), CC_A(_), CC_C(CC_A(_), CC_A(_), _)) => 19 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), CC_A(_), CC_C(CC_B(_, _, _), CC_A(_), _)) => 20 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), CC_A(_), CC_C(CC_C(_, _, _), CC_A(_), _)) => 21 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), CC_A(_), CC_A(_)) => 22 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), CC_A(_), CC_B(_, _, CC_A(_))) => 23 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), CC_A(_), CC_B(_, _, CC_B(_, _, _))) => 24 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), CC_A(_), CC_B(_, _, CC_C(_, _, _))) => 25 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), CC_A(_), CC_C(CC_A(_), CC_A(_), _)) => 26 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), CC_A(_), CC_C(CC_B(_, _, _), CC_A(_), _)) => 27 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), CC_A(_), CC_C(CC_C(_, _, _), CC_A(_), _)) => 28 
  case CC_C(CC_C(_, _, _), CC_A(_), CC_A(_)) => 29 
  case CC_C(CC_C(_, _, _), CC_A(_), CC_B(_, _, CC_A(_))) => 30 
  case CC_C(CC_C(_, _, _), CC_A(_), CC_B(_, _, CC_B(_, _, _))) => 31 
  case CC_C(CC_C(_, _, _), CC_A(_), CC_B(_, _, CC_C(_, _, _))) => 32 
  case CC_C(CC_C(_, _, _), CC_A(_), CC_C(CC_A(_), CC_A(_), _)) => 33 
  case CC_C(CC_C(_, _, _), CC_A(_), CC_C(CC_B(_, _, _), CC_A(_), _)) => 34 
  case CC_C(CC_C(_, _, _), CC_A(_), CC_C(CC_C(_, _, _), CC_A(_), _)) => 35 
}
}
// This is not matched: CC_A(_)
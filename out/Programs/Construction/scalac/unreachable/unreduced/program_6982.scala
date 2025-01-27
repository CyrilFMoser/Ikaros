package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[D], D]) extends T_A[T_B[D], D]
case class CC_B[E](a: T_A[T_B[E], E], b: T_B[E]) extends T_A[T_B[E], E]
case class CC_C[F](a: (CC_A[Int],T_A[Int, Char])) extends T_B[F]
case class CC_D[G](a: T_A[T_B[G], G]) extends T_B[G]
case class CC_E[H](a: Char) extends T_B[H]

val v_a: T_A[T_B[Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(CC_A(_), CC_C(_))) => 1 
  case CC_A(CC_B(CC_B(_, _), CC_C(_))) => 2 
  case CC_A(CC_B(CC_A(_), CC_D(_))) => 3 
  case CC_A(CC_B(CC_B(_, _), CC_D(_))) => 4 
  case CC_A(CC_B(CC_A(_), CC_E(_))) => 5 
  case CC_A(CC_B(CC_B(_, _), CC_E(_))) => 6 
  case CC_B(CC_A(_), CC_D(CC_A(_))) => 7 
  case CC_B(CC_A(_), CC_D(CC_B(_, _))) => 8 
  case CC_B(CC_A(_), CC_E(_)) => 9 
  case CC_B(CC_B(_, CC_C(_)), CC_C((_,_))) => 10 
  case CC_B(CC_B(_, CC_C(_)), CC_D(CC_A(_))) => 11 
  case CC_B(CC_B(_, CC_C(_)), CC_D(CC_B(_, _))) => 12 
  case CC_B(CC_B(_, CC_C(_)), CC_E(_)) => 13 
  case CC_B(CC_B(_, CC_D(_)), CC_C((_,_))) => 14 
  case CC_B(CC_B(_, CC_D(_)), CC_D(CC_A(_))) => 15 
  case CC_B(CC_B(_, CC_D(_)), CC_D(CC_B(_, _))) => 16 
  case CC_B(CC_B(_, CC_D(_)), CC_E(_)) => 17 
  case CC_B(CC_B(_, CC_E(_)), CC_C((_,_))) => 18 
  case CC_B(CC_B(_, CC_E(_)), CC_D(CC_A(_))) => 19 
  case CC_B(CC_B(_, CC_E(_)), CC_D(CC_B(_, _))) => 20 
  case CC_B(CC_B(_, CC_E(_)), CC_E(_)) => 21 
}
}
// This is not matched: CC_B(CC_A(_), CC_C((_,_)))
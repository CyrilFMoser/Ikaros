package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[T_B[Int], (Char,Char)]]
case class CC_B[E](a: T_B[E], b: T_A[E, E], c: T_B[E]) extends T_B[E]
case class CC_C[F](a: T_B[F]) extends T_B[F]
case class CC_D[G](a: T_B[G]) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _)) => 0 
  case CC_C(CC_C(CC_B(_, _, _))) => 1 
  case CC_C(CC_C(CC_C(_))) => 2 
  case CC_C(CC_C(CC_D(_))) => 3 
  case CC_C(CC_D(_)) => 4 
  case CC_D(_) => 5 
}
}
// This is not matched: CC_B(_, _, _)
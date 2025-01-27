package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D], c: T_A[D, D]) extends T_A[T_A[T_B[Byte], T_B[Int]], D]
case class CC_B[E](a: T_A[E, E], b: E) extends T_B[E]
case class CC_C[F](a: T_A[F, F]) extends T_B[F]
case class CC_D[G](a: T_B[G]) extends T_B[G]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _)) => 0 
  case CC_D(CC_C(_)) => 1 
  case CC_D(CC_D(CC_C(_))) => 2 
  case CC_D(CC_D(CC_D(_))) => 3 
}
}
// This is not matched: CC_D(CC_D(CC_B(_, _)))
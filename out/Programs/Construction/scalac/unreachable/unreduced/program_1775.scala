package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, Char]) extends T_A[E, Char]
case class CC_B[F](a: T_A[F, F], b: Int, c: T_B[F, F]) extends T_A[F, Char]
case class CC_C[G, H]() extends T_B[H, G]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
}
}
// This is not matched: CC_B(_, _, _)
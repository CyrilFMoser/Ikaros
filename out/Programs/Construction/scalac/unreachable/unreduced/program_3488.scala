package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, F], b: T_B[Char, E]) extends T_A[E, F]
case class CC_B[G, H]() extends T_A[H, G]
case class CC_C[I]() extends T_B[I, T_A[T_A[I, I], I]]
case class CC_D[J](a: (Int,T_A[Boolean, Byte]), b: T_B[J, J], c: T_A[J, J]) extends T_B[J, T_A[T_A[J, J], J]]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(CC_A(_, _), _)
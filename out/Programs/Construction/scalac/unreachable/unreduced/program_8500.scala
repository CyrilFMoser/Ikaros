package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, (Int,T_B[Int, Boolean])]
case class CC_B[F, G](a: T_B[F, G]) extends T_B[F, G]
case class CC_C[I, H, J](a: CC_A[H], b: CC_A[H]) extends T_B[I, H]

val v_a: CC_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_B(CC_C(CC_A(_), CC_A(_))) => 1 
}
}
package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D], c: D) extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: CC_A[F]) extends T_B[F, T_A[F]]
case class CC_D[G](a: T_B[G, T_A[G]]) extends T_B[G, T_A[G]]
case class CC_E[H](a: T_B[CC_D[H], H], b: T_B[H, T_A[H]]) extends T_B[CC_D[H], H]

val v_a: T_B[Char, T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_A(_, _, _), _)) => 0 
  case CC_C(CC_A(_, CC_B(_), _)) => 1 
  case CC_D(CC_C(CC_A(_, _, _))) => 2 
  case CC_D(CC_D(CC_C(_))) => 3 
  case CC_D(CC_D(CC_D(_))) => 4 
}
}
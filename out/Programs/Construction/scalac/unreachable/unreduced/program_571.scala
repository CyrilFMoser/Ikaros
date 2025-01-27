package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: ((Byte,Boolean),Boolean), b: T_B[E, E], c: T_A[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, T_B[F, F]], b: Byte, c: CC_A[F]) extends T_A[F, T_B[F, F]]
case class CC_C[H, G](a: T_A[H, T_B[H, H]]) extends T_B[G, H]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_C(CC_B(_, _, _)) => 1 
}
}
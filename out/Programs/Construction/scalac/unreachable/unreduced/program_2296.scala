package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: CC_A[E]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: CC_A[F]) extends T_A[F, T_A[F, F]]
case class CC_D[G](a: T_A[G, G], b: T_A[G, T_A[G, G]], c: T_A[G, G]) extends T_B[G]
case class CC_E[H](a: T_A[H, T_A[H, H]]) extends T_B[H]
case class CC_F[I](a: Int) extends T_B[I]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _, CC_A(_, _, _)), _) => 0 
  case CC_D(_, CC_A(_, _, CC_B(_)), _) => 1 
  case CC_D(_, CC_A(_, _, CC_C(_)), _) => 2 
  case CC_D(_, CC_B(CC_A(_, _, _)), _) => 3 
  case CC_D(_, CC_C(CC_A(_, _, _)), _) => 4 
  case CC_E(CC_A(_, _, _)) => 5 
  case CC_E(CC_B(CC_A(_, _, _))) => 6 
  case CC_E(CC_C(CC_A(_, _, _))) => 7 
  case CC_F(_) => 8 
}
}
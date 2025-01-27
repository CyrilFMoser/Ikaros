package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_B[E, E]], b: T_B[E, E]) extends T_A[E, T_B[T_B[Byte, Int], T_A[(Char,Byte), Boolean]]]
case class CC_B[F](a: T_B[T_A[F, F], F]) extends T_A[T_A[CC_A[Int], T_A[Byte, Boolean]], F]
case class CC_C[H, G](a: CC_A[H], b: CC_B[H]) extends T_B[G, H]
case class CC_D[J, I](a: T_B[J, I], b: CC_A[J]) extends T_B[J, I]
case class CC_E[K, L](a: CC_A[K], b: K, c: (T_B[Char, Int],CC_B[Boolean])) extends T_B[L, K]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_C(_, _)), CC_B(_)) => 0 
  case CC_C(CC_A(_, CC_D(_, _)), CC_B(_)) => 1 
  case CC_C(CC_A(_, CC_E(_, _, _)), CC_B(_)) => 2 
  case CC_D(_, CC_A(_, CC_C(_, _))) => 3 
  case CC_D(_, CC_A(_, CC_D(_, _))) => 4 
  case CC_D(_, CC_A(_, CC_E(_, _, _))) => 5 
  case CC_E(_, _, _) => 6 
}
}
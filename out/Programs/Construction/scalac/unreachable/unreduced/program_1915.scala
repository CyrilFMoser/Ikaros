package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char, b: T_B[E, T_A[E, E]], c: (T_A[Boolean, Boolean],T_A[Boolean, (Boolean,Boolean)])) extends T_A[Boolean, E]
case class CC_B[F](a: T_A[T_A[F, F], F], b: T_A[F, F]) extends T_A[F, (T_A[Boolean, Int],T_B[Boolean, Int])]
case class CC_C[G, H]() extends T_B[H, G]
case class CC_D[J, I](a: T_B[J, I]) extends T_B[J, I]

val v_a: T_A[Boolean, (T_A[Boolean, Int],T_B[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_B(_, _) => 1 
}
}
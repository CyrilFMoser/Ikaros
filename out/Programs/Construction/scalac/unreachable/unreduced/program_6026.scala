package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_B[F](a: T_A[F, T_B[F]], b: T_A[F, F]) extends T_A[F, T_B[F]]
case class CC_C[G]() extends T_A[G, T_B[G]]
case class CC_D(a: (T_B[Boolean],CC_B[Int])) extends T_B[T_A[Int, T_B[Int]]]
case class CC_E(a: T_A[T_A[CC_D, CC_D], CC_D]) extends T_B[T_A[Int, T_B[Int]]]

val v_a: T_B[T_A[Int, T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_D((_,CC_B(_, _))) => 0 
  case CC_E(CC_A()) => 1 
}
}
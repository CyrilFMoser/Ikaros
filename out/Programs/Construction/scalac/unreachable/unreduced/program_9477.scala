package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_B[F]() extends T_A[F, T_A[F, F]]
case class CC_C[G, H](a: T_B[G, G]) extends T_A[G, T_A[G, G]]
case class CC_D[I](a: T_A[I, T_A[I, I]], b: CC_C[I, I], c: T_A[I, T_A[I, I]]) extends T_B[I, (CC_A[Boolean],T_B[Int, Boolean])]
case class CC_E[J](a: Byte, b: Byte) extends T_B[J, (CC_A[Boolean],T_B[Int, Boolean])]

val v_a: T_B[Char, (CC_A[Boolean],T_B[Int, Boolean])] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, CC_A(_, _)), _, _) => 0 
  case CC_D(CC_A(_, CC_B()), _, _) => 1 
  case CC_D(CC_A(_, CC_C(_)), _, _) => 2 
  case CC_D(CC_B(), _, _) => 3 
  case CC_D(CC_C(_), _, _) => 4 
  case CC_E(_, _) => 5 
}
}
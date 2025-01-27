package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[T_B[C, C], C], b: C) extends T_A
case class CC_B(a: CC_A[T_A], b: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[D]() extends T_B[D, T_B[D, D]]
case class CC_E[E](a: E, b: T_B[E, T_B[E, E]], c: T_B[CC_C, E]) extends T_B[CC_C, E]
case class CC_F[F](a: T_B[F, T_B[F, F]], b: CC_D[F]) extends T_B[CC_C, F]

val v_a: T_B[CC_C, CC_B] = null
val v_b: Int = v_a match{
  case CC_E(CC_B(CC_A(_, _), _), _, _) => 0 
  case CC_F(_, CC_D()) => 1 
}
}
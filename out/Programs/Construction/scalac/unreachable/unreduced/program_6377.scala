package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Boolean,T_B[Char, Char]), b: T_B[E, E], c: T_A[E, E]) extends T_A[T_B[E, T_A[E, E]], E]
case class CC_B[F](a: CC_A[F]) extends T_A[T_B[F, T_A[F, F]], F]
case class CC_C[G, H]() extends T_A[G, H]
case class CC_D[I](a: I) extends T_B[I, T_B[I, I]]

val v_a: T_A[T_B[Boolean, T_A[Boolean, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(CC_A(_, _, CC_C())) => 1 
  case CC_C() => 2 
}
}
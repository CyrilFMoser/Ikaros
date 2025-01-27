package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_B[Boolean],T_A[Byte, Int]), b: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[F, E](a: T_A[E, E], b: T_A[E, T_B[E]]) extends T_A[F, E]
case class CC_C[G, H](a: T_A[G, T_B[G]], b: CC_A[H]) extends T_A[G, T_B[G]]
case class CC_D() extends T_B[T_A[CC_C[Int, Byte], T_B[CC_C[Int, Byte]]]]

val v_a: T_A[CC_D, T_B[CC_D]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(CC_B(_, _), _)
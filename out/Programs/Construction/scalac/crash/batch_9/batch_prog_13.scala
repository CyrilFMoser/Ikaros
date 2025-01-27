package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: (T_A[Byte, Char],Char), b: Boolean) extends T_A[C, D]
case class CC_B[E, F](a: T_A[E, F], b: T_A[F, F], c: CC_A[E, E]) extends T_A[F, E]
case class CC_C[G](a: G, b: G, c: Byte) extends T_A[T_A[G, G], G]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),_), _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_A((CC_B(_, _, _),_), _)
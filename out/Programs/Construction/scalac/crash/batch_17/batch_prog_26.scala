package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E], c: T_B[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_B[F, F], b: T_A[F, T_A[F, F]], c: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]
case class CC_C[G](a: Byte, b: T_A[G, T_A[G, G]], c: T_A[G, T_A[G, G]]) extends T_B[CC_A[CC_A[Boolean]], G]
case class CC_D[H]() extends T_B[CC_A[CC_A[Boolean]], H]
case class CC_E(a: CC_A[T_B[Boolean, Byte]]) extends T_B[CC_A[CC_A[Boolean]], T_B[CC_B[Byte], T_B[Char, Int]]]

val v_a: T_A[CC_E, T_A[CC_E, CC_E]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}
// This is not matched: CC_A(_, _, _)
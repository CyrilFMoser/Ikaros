package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, E]) extends T_A[E, Char]
case class CC_B[G](a: T_A[G, Char], b: T_A[G, T_A[G, G]], c: CC_A[G, G]) extends T_B[T_A[T_B[(Boolean,Boolean), Byte], T_B[Boolean, Boolean]], G]
case class CC_C[H](a: CC_B[H], b: CC_B[H]) extends T_B[T_A[T_B[(Boolean,Boolean), Byte], T_B[Boolean, Boolean]], H]
case class CC_D[I](a: I, b: T_B[I, I], c: T_A[CC_B[I], I]) extends T_B[T_A[T_B[(Boolean,Boolean), Byte], T_B[Boolean, Boolean]], I]

val v_a: T_B[T_A[T_B[(Boolean,Boolean), Byte], T_B[Boolean, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _, CC_A(_)) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, _, _) => 2 
}
}
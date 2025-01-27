package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[T_A[(Boolean,Int), Boolean], T_B[(Int,Boolean), Boolean]], T_B[T_A[Boolean, Byte], T_A[Char, Boolean]]]
case class CC_B[F, E](a: Char, b: T_A[F, T_B[F, F]], c: (Byte,T_B[CC_A, CC_A])) extends T_B[F, E]
case class CC_C[G, H](a: H) extends T_B[G, H]
case class CC_D[I](a: CC_B[I, I], b: T_B[I, I], c: T_B[I, I]) extends T_B[T_B[T_B[Boolean, CC_A], (CC_A,CC_A)], I]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,CC_B(_, _, _))) => 0 
  case CC_B(_, _, (_,CC_C(_))) => 1 
  case CC_C(_) => 2 
}
}
package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, E]) extends T_A[E, F]
case class CC_B[G, H](a: T_A[T_B[G, H], H]) extends T_B[T_B[G, G], G]
case class CC_C[I](a: T_B[T_B[I, I], I], b: T_B[T_B[I, I], I], c: (Char,T_A[Byte, Int])) extends T_B[T_B[I, I], I]

val v_a: T_B[T_B[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, (_,CC_A(_))) => 1 
}
}
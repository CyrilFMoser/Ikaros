package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char, b: E, c: T_B[E, E]) extends T_A[T_B[T_B[E, E], E], E]
case class CC_B(a: T_A[Int, T_B[Boolean, Char]]) extends T_A[T_B[T_B[T_A[(Int,Char), CC_A[Char]], T_A[(Int,Char), CC_A[Char]]], T_A[(Int,Char), CC_A[Char]]], T_A[(Int,Char), CC_A[Char]]]
case class CC_C() extends T_A[T_B[T_B[T_A[(Int,Char), CC_A[Char]], T_A[(Int,Char), CC_A[Char]]], T_A[(Int,Char), CC_A[Char]]], T_A[(Int,Char), CC_A[Char]]]
case class CC_D[F](a: T_B[F, F]) extends T_B[F, T_A[F, F]]
case class CC_E[G, H](a: CC_B, b: CC_D[H]) extends T_B[G, H]
case class CC_F[I](a: I) extends T_B[I, T_A[I, I]]

val v_a: T_B[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_D(CC_E(_, CC_D(_))) => 0 
  case CC_E(CC_B(_), CC_D(CC_E(_, _))) => 1 
}
}
// This is not matched: CC_F(_)
package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Char],Char), b: T_A[T_A[(Boolean,Byte)]]) extends T_A[T_B[Char, T_A[Char]]]
case class CC_B[D](a: CC_A, b: T_B[D, D]) extends T_A[D]
case class CC_C[E](a: T_A[E]) extends T_B[T_A[CC_A], E]
case class CC_D[F](a: F, b: F, c: CC_B[F]) extends T_B[T_A[CC_A], F]
case class CC_E[G](a: Char, b: G, c: Char) extends T_B[T_A[CC_A], G]

val v_a: T_B[T_A[CC_A], T_A[T_B[Char, T_A[Char]]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, CC_A(_, _), _) => 1 
  case CC_D(_, CC_B(_, _), _) => 2 
}
}
// This is not matched: CC_E(_, _, _)
package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, E], T_B[E, E]], b: T_B[E, E]) extends T_A[T_B[(Int,Char), T_B[Char, Char]], E]
case class CC_B[F](a: F) extends T_A[T_B[(Int,Char), T_B[Char, Char]], F]
case class CC_C[G](a: T_A[G, G], b: T_B[G, G], c: Int) extends T_A[T_B[(Int,Char), T_B[Char, Char]], G]
case class CC_D[H, I](a: CC_B[H], b: T_B[H, H], c: CC_C[I]) extends T_B[I, H]

val v_a: T_A[T_B[(Int,Char), T_B[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(CC_B(_), CC_D(_, _, _), CC_C(_, _, _))) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, _, _)
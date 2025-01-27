package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char, b: T_A[E, E], c: T_A[E, E]) extends T_A[E, Char]
case class CC_B[F, G](a: T_A[G, Char], b: CC_A[G], c: T_B[F, G]) extends T_A[F, Char]
case class CC_C[H](a: Boolean, b: CC_A[T_A[H, Char]]) extends T_A[H, Char]
case class CC_D[J, I]() extends T_B[I, J]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_A(_, _, _)) => 1 
}
}
// This is not matched: CC_A(_, _, _)
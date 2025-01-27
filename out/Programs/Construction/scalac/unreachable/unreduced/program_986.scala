package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B(a: CC_A[T_A[Int]]) extends T_A[T_B[Char, T_A[Char]]]
case class CC_C[E](a: Boolean, b: T_A[E], c: Int) extends T_A[E]
case class CC_D[F](a: F, b: F, c: F) extends T_B[F, T_A[Char]]

val v_a: T_A[T_B[Char, T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_C(_, CC_A(_), _) => 2 
  case CC_C(_, CC_B(_), _) => 3 
}
}
// This is not matched: CC_C(_, CC_C(_, _, _), _)
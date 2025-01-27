package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: T_A[D, T_A[C, D]]) extends T_A[C, T_A[T_A[Char, Char], T_A[Int, Char]]]
case class CC_B[E](a: CC_A[E, E], b: Int, c: CC_A[E, E]) extends T_A[E, T_A[T_A[Char, Char], T_A[Int, Char]]]
case class CC_C[F](a: F) extends T_A[F, T_A[T_A[Char, Char], T_A[Int, Char]]]

val v_a: T_A[Int, T_A[T_A[Char, Char], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_)
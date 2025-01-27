package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D]) extends T_A[Int, D]
case class CC_B[E](a: T_A[Int, E], b: E) extends T_A[Int, E]
case class CC_C[F](a: T_B[T_B[CC_B[Int]]], b: F, c: CC_B[F]) extends T_B[F]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(CC_C(_, _, _), 'x', CC_B(_, _))) => 0 
  case CC_A(_, CC_C(CC_C(_, _, _), _, CC_B(_, _))) => 1 
  case CC_B(_, _) => 2 
}
}
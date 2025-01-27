package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: T_B[((Int,Char),Boolean), T_A[E, E]], c: E) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, F], b: T_A[F, T_B[F, F]], c: CC_A[F]) extends T_A[F, T_B[F, F]]
case class CC_C[G]() extends T_A[T_A[T_A[Int, Int], T_B[T_A[Int, Int], T_A[Int, Int]]], G]

val v_a: T_A[Boolean, T_B[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_B(_, CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 2 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _, _)), CC_A(_, _, _))
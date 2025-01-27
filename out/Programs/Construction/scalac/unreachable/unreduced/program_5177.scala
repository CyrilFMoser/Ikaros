package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D], c: T_A[T_B[Char], D]) extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C[F](a: CC_A[F], b: T_A[F, T_A[F, F]], c: T_B[F]) extends T_A[F, T_A[F, F]]
case class CC_D[G](a: T_B[G], b: T_A[G, T_A[G, G]], c: T_A[G, T_A[G, G]]) extends T_B[G]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(CC_D(_, _, _), _, _), CC_D(_, _, _)) => 1 
  case CC_C(_, CC_B(), CC_D(_, _, _)) => 2 
  case CC_C(_, CC_C(_, _, _), CC_D(_, _, _)) => 3 
}
}
// This is not matched: CC_A(CC_D(CC_D(_, _, _), _, _), _, _)
package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, D]]
case class CC_B[E](a: T_A[E, T_A[E, E]], b: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: T_A[F, T_A[F, F]], b: Int, c: F) extends T_A[F, T_A[F, F]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(), _, _) => 1 
  case CC_C(CC_B(_, _), _, _) => 2 
  case CC_C(CC_C(_, _, _), _, _) => 3 
}
}
// This is not matched: CC_A()
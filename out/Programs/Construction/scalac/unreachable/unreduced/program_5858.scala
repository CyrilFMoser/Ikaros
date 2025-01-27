package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: C) extends T_A[C, T_A[C, C]]
case class CC_B[D, E]() extends T_A[D, T_A[D, D]]
case class CC_C[F](a: F) extends T_A[F, T_A[F, F]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_)
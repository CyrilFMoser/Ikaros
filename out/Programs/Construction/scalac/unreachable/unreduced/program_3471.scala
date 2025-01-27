package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: E) extends T_A[E]
case class CC_C[F]() extends T_B[F, T_B[CC_B[F], F]]
case class CC_D[G](a: CC_C[G]) extends T_B[G, T_B[CC_B[G], G]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_B(_, _), _), _) => 0 
  case CC_A(CC_B(_, _), _) => 1 
  case CC_B(CC_A(CC_A(_, _), _), true) => 2 
  case CC_B(CC_A(CC_B(_, _), _), true) => 3 
  case CC_B(CC_B(_, _), true) => 4 
  case CC_B(CC_A(CC_A(_, _), _), false) => 5 
  case CC_B(CC_A(CC_B(_, _), _), false) => 6 
  case CC_B(CC_B(_, _), false) => 7 
}
}
// This is not matched: CC_A(CC_A(CC_A(_, _), _), _)
package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: T_A[D, T_B[Boolean]], c: T_B[E]) extends T_A[D, T_B[Boolean]]
case class CC_B[F](a: CC_A[F, F], b: T_A[F, T_B[Boolean]]) extends T_B[F]
case class CC_C[G](a: T_B[G], b: G) extends T_B[G]
case class CC_D[H](a: CC_C[H], b: T_B[H], c: H) extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_, _), _, _), _) => 0 
  case CC_B(CC_A(CC_C(_, _), _, _), _) => 1 
  case CC_C(_, _) => 2 
  case CC_D(_, _, 12) => 3 
  case CC_D(_, _, _) => 4 
}
}
// This is not matched: CC_B(CC_A(CC_D(_, _, _), _, _), _)
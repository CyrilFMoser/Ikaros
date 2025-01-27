package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, E], b: D) extends T_A[D, E]
case class CC_B[F, G](a: T_B[F], b: T_A[F, F], c: F) extends T_A[G, F]
case class CC_C[I, H](a: T_A[H, I]) extends T_A[H, I]
case class CC_D[J](a: T_A[J, J]) extends T_B[T_A[Int, T_A[Boolean, Int]]]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_, _), _)) => 0 
  case CC_D(CC_A(CC_B(_, _, _), _)) => 1 
  case CC_D(CC_A(CC_C(_), _)) => 2 
  case CC_D(CC_B(_, _, _)) => 3 
  case CC_D(CC_C(CC_A(_, _))) => 4 
  case CC_D(CC_C(CC_B(_, _, _))) => 5 
  case CC_D(CC_C(CC_C(_))) => 6 
}
}
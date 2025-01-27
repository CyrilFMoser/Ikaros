package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D, E](a: T_A[T_B, D], b: D) extends T_A[T_B, D]
case class CC_C[F](a: T_B, b: T_A[F, F], c: F) extends T_A[T_B, F]

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C(_, _, _)) => 4 
  case CC_B(CC_A(CC_A(_)), _) => 5 
  case CC_B(CC_A(CC_B(_, _)), _) => 6 
  case CC_B(CC_A(CC_C(_, _, _)), _) => 7 
  case CC_B(CC_B(CC_A(_), _), _) => 8 
  case CC_B(CC_B(CC_B(_, _), _), _) => 9 
  case CC_B(CC_C(_, _, _), _) => 10 
  case CC_C(_, _, _) => 11 
}
}
// This is not matched: CC_B(CC_B(CC_C(_, _, _), _), _)
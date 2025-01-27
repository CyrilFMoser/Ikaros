package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: (T_B[Char],T_A[Char, Byte]), c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: Byte, b: CC_B[F], c: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, (_,_), _)) => 1 
  case CC_B(CC_B(CC_A(_, _, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C(_, _, _))) => 4 
  case CC_B(CC_C(_, _, _)) => 5 
  case CC_C(_, _, _) => 6 
}
}
package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[D], b: T_A[E, T_A[D, D]], c: T_A[T_B[E], T_B[E]]) extends T_A[D, (T_B[Char],T_B[(Char,Char)])]
case class CC_B[F](a: CC_A[F, F]) extends T_A[F, (T_B[Char],T_B[(Char,Char)])]

val v_a: T_A[Byte, (T_B[Char],T_B[(Char,Char)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
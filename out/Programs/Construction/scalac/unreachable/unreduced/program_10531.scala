package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: T_A[D, D]) extends T_A[D, T_B[D]]
case class CC_B[E, F](a: E, b: T_B[F]) extends T_B[E]
case class CC_C[G](a: T_B[G]) extends T_B[G]
case class CC_D[H](a: Byte, b: H, c: CC_A[H]) extends T_B[H]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_B('x', _)) => 1 
  case CC_C(CC_B(_, _)) => 2 
  case CC_C(CC_C(CC_B(_, _))) => 3 
  case CC_C(CC_C(CC_C(_))) => 4 
  case CC_C(CC_D(0, _, _)) => 5 
  case CC_C(CC_D(_, _, _)) => 6 
  case CC_D(0, _, CC_A('x', _)) => 7 
  case CC_D(0, _, CC_A(_, _)) => 8 
  case CC_D(_, _, CC_A('x', _)) => 9 
  case CC_D(_, _, CC_A(_, _)) => 10 
}
}
// This is not matched: CC_C(CC_C(CC_D(_, _, _)))
package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B[D, E](a: CC_A[E]) extends T_A[D, T_A[D, T_A[D, D]]]
case class CC_C[F]() extends T_A[F, T_A[F, T_A[F, F]]]

val v_a: T_A[Char, T_A[Char, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: CC_C()
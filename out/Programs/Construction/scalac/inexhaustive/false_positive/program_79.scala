package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C[I](a: T_B[I, I], b: I) extends T_A[CC_A[I, I], I]
case class CC_F[L]() extends T_B[L, CC_B[L, L]]

val v_a: T_A[CC_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, 'x') => 2 
}
}
// This is not matched: CC_A(CC_B(_, _), _)
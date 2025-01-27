package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[F, E, G](a: CC_A[E, T_B]) extends T_A[F, E]
case class CC_C[I, H](a: Boolean, b: I) extends T_A[H, I]
case class CC_D(a: T_A[T_B, T_B], b: Char) extends T_B

val v_a: T_A[CC_D, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
  case CC_C(_, 'x') => 2 
  case CC_B(_) => 3 
  case CC_B(CC_A()) => 4 
}
}
// This is not matched: (CC_B (CC_D T_B T_B T_B) Char T_B Wildcard (T_A (CC_D T_B T_B T_B) Char))
// This is not matched: (CC_B (CC_D T_B T_B T_B) Char T_B Wildcard (T_A (CC_D T_B T_B T_B) Char))
package Program_30 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E]() extends T_A[D]
case class CC_B[G, F](a: T_A[G], b: T_B[G, G]) extends T_B[F, G]
case class CC_C[H, I](a: T_B[I, I]) extends T_B[H, I]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char Boolean (T_A Char))
// This is not matched: (CC_A Char Boolean (T_A Char))
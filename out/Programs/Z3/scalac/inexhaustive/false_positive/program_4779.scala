package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B[H, G](a: G, b: T_A[H, Boolean], c: T_A[G, G]) extends T_A[H, G]

val v_a: CC_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
}
}
// This is not matched: (CC_C (T_A (T_B Boolean Byte)))
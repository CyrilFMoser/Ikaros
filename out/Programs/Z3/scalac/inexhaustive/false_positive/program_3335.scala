package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F]() extends T_A[F, E]
case class CC_C[G, H](a: (Char,Int), b: H, c: T_A[H, H]) extends T_A[H, G]

val v_a: CC_C[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[E, F](a: T_A[F, Int]) extends T_A[F, E]
case class CC_C[G, H]() extends T_A[H, G]

val v_a: CC_B[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_B(CC_C()) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A Char))
package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[H, G](a: T_A[G, G]) extends T_A[H, G]

val v_a: CC_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: CC_A(CC_A(_))
package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[H, G](a: T_B, b: T_B, c: T_A[Boolean, G]) extends T_A[G, H]

val v_a: CC_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Boolean (T_A Boolean))
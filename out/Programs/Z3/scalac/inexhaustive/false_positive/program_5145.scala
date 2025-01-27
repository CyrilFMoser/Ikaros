package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[H, G](a: T_B, b: T_B, c: T_A[Boolean, G]) extends T_A[G, H]
case class CC_C[I]() extends T_A[I, Byte]

val v_a: CC_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_B Boolean (T_A Boolean))
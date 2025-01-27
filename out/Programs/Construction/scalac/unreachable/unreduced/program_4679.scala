package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[(Byte,T_A[Byte])]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[(Byte,T_A[Byte])]
case class CC_C[D, E]() extends T_B[D, E]
case class CC_D[F, G](a: F) extends T_B[G, F]
case class CC_E[H, I](a: Byte, b: CC_C[I, I], c: Byte) extends T_B[H, I]

val v_a: T_A[(Byte,T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
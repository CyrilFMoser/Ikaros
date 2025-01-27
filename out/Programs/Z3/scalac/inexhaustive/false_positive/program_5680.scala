package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_D[I](a: Int) extends T_B[CC_A[I, I], I]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard (T_A (T_A Byte Byte) Byte))
package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[D, C](a: T_A[D, D]) extends T_A[D, C]
case class CC_C[E, F]() extends T_A[F, E]

val v_a: CC_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_A Byte T_B Byte Wildcard (T_A Byte (T_A Byte Byte)))
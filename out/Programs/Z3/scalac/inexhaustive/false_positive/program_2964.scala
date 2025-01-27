package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_B[D](a: D, b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_C[E, F]() extends T_B[F, E]
case class CC_D[G, H]() extends T_B[G, H]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_A Char Wildcard Wildcard (T_A Char (T_A Char Char)))
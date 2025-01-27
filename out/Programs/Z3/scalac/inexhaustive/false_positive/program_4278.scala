package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B[G, H](a: T_A[G, H]) extends T_A[G, H]

val v_a: CC_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
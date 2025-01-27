package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, D]() extends T_A[D, E]
case class CC_B[F, G](a: G, b: T_A[F, G]) extends T_A[F, G]

val v_a: CC_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B() extends T_A
case class CC_C[C, D]() extends T_B[C, D]
case class CC_D[F, E](a: T_B[E, E]) extends T_B[F, E]

val v_a: CC_D[CC_B, Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
package Program_15 

object Test {
sealed trait T_B[C, D]
case class CC_C[I, J]() extends T_B[I, J]
case class CC_E[M, N](a: T_B[N, N]) extends T_B[M, N]

val v_a: CC_E[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_E(CC_E(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
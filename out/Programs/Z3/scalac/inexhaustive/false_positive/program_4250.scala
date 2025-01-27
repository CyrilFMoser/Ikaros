package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_C[G, F](a: T_B[F]) extends T_A[G, F]
case class CC_D[H]() extends T_B[H]
case class CC_E[I]() extends T_B[I]

val v_a: CC_C[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_E()) => 0 
}
}
// This is not matched: Pattern match is empty without constants
package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[F, E](a: T_A[Boolean, E]) extends T_A[F, E]

val v_a: CC_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
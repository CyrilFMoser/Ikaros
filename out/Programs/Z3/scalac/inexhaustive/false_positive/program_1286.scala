package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E, b: T_B[E, F]) extends T_A[F, E]
case class CC_D[I]() extends T_B[I, Boolean]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
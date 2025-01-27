package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E]) extends T_A[(Char,Int), E]
case class CC_B[F, G]() extends T_B[F, G]
case class CC_C[H, I]() extends T_B[H, I]

val v_a: T_A[(Char,Int), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
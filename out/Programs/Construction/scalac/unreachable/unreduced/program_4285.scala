package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[Char, D]
case class CC_B[E](a: Boolean, b: T_A[E, E], c: T_A[Char, E]) extends T_A[Char, E]
case class CC_C[F]() extends T_A[Char, F]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C()
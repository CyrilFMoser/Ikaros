package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[D]() extends T_A[Int, D]
case class CC_C[E](a: E, b: T_A[Int, E]) extends T_A[Int, E]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants
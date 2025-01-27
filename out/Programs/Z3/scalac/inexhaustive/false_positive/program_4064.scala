package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[Int, D], b: T_A[C, C]) extends T_A[C, D]
case class CC_B[F, E]() extends T_A[F, E]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
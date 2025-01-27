package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Int, b: T_A[(Byte,Char), D]) extends T_A[C, D]
case class CC_B[F, E]() extends T_A[E, F]

val v_a: CC_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
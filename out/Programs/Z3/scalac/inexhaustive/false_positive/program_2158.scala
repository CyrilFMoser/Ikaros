package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char], b: T_B[Boolean]) extends T_A[T_A[Int]]
case class CC_D[D]() extends T_B[D]
case class CC_E[E]() extends T_B[E]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_E()) => 0 
}
}
// This is not matched: Pattern match is empty without constants
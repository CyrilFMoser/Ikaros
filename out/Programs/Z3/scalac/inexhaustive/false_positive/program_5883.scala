package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants
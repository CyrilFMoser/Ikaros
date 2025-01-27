package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B[D]() extends T_B[D]
case class CC_C[E](a: T_B[E], b: T_A[E]) extends T_B[E]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
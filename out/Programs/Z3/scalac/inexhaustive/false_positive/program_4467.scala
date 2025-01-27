package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D]() extends T_B[D]
case class CC_C[E](a: CC_A[E], b: T_B[E]) extends T_B[E]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
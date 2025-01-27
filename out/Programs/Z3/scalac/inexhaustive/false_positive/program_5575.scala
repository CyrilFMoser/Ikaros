package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E]) extends T_A[E]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_A T_A T_A)
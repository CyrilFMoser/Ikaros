package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[Int]) extends T_A[E]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)
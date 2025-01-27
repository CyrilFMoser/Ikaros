package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[Int]) extends T_A[E]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_C Wildcard (T_A (CC_A Byte Boolean)))